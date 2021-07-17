package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.streamlangarage.R;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.util.Calendar;

public class ApprovedDetails extends AppCompatActivity {
   Button btn,mCarReceived,mConfirmBtn,mSkipBtn;
   TextView statustype , mPreferedDate, mCalendarDateText,TimeRange;
   ImageView mBack, mCalendarImg;
   RelativeLayout Time;
   ImageView increment,decrement;
   LinearLayout samplecar;
    Calendar mcurrentTime;
    TimePickerDialog mTimePicker;
    DatePickerDialog picker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        setContentView(R.layout.activity_approved_details);



        mPreferedDate = (TextView)findViewById(R.id.tv);
        mPreferedDate.setText("Scheduled Service Repair Date");
        btn=(Button)findViewById(R.id.btnvehicleservice);

        mCarReceived=(Button)findViewById(R.id.car_received_btn);
        mBack = (ImageView) findViewById(R.id.lefarrow);
        statustype=findViewById(R.id.statustype);
        statustype.setText("Approved");
        statustype.setTextColor(getResources().getColor(R.color.green));
        btn.setText("Message");
        samplecar=findViewById(R.id.samplecar);
        samplecar.setBackgroundDrawable(getDrawable(R.drawable.top_round));

        dialogBox();

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ApprovedDetails.this,MainActivity.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ApprovedDetails.this,Chat_Details.class));
            }
        });

    }

    private void dialogBox()
    {

        mCarReceived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(ApprovedDetails.this);
                dialog.setContentView(R.layout.dialog_date_time);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                mConfirmBtn = (Button)dialog.findViewById(R.id.confirm_date_time);
                increment=dialog.findViewById(R.id.top_time_click);
                decrement=dialog.findViewById(R.id.bottomclick);
                mCalendarImg = (ImageView)dialog.findViewById(R.id.calander_icon_s);
                Time=dialog.findViewById(R.id.time_RL);
                TimeRange=dialog.findViewById(R.id.tvsettime);
                mCalendarDateText = (TextView)dialog.findViewById(R.id.date_s);
                mSkipBtn = (Button)dialog.findViewById(R.id.skip_date_time);
                dialog.show();

                 Time.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mcurrentTime = Calendar.getInstance();
                        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                        int minute = mcurrentTime.get(Calendar.MINUTE);
                        int am=mcurrentTime.get(Calendar.AM_PM);

                        mTimePicker = new TimePickerDialog(ApprovedDetails.this,R.style.DialogTheme, new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                                TimeRange.setText( selectedHour + ":" + selectedMinute);
                                mTimePicker.getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));
                            }
                        }, hour, minute, false);//Yes 24 hour time
                        mTimePicker.show();
                    }
                });






                mCalendarImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        final Calendar cldr = Calendar.getInstance();
                        int day = cldr.get(Calendar.DAY_OF_MONTH);
                        int month = cldr.get(Calendar.MONTH);
                        int year = cldr.get(Calendar.YEAR);
                        // date picker dialog
                        picker = new DatePickerDialog(ApprovedDetails.this,R.style.DialogTheme,
                                new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                        mCalendarDateText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                                    }
                                }, year, month, day);
                        picker.show();
                    }
                });






                mConfirmBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(ApprovedDetails.this,MainActivity.class);
                        intent.putExtra("confirmBtn",2);
                        startActivity(intent);
                    }
                });


                mSkipBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });

    }
}