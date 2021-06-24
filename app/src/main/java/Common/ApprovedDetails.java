package Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlangarage.Common.Fragments.Navigations.InProgress;
import com.example.streamlangarage.Common.Fragments.Navigations.VehicleServiceProgress;
import com.example.streamlangarage.R;

public class ApprovedDetails extends AppCompatActivity {
   Button btn,mCarReceived,mConfirmBtn,mSkipBtn;
   TextView statustype , mPreferedDate;
   ImageView mBack;
   LinearLayout samplecar;
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
                mSkipBtn = (Button)dialog.findViewById(R.id.skip_date_time);
                dialog.show();

                mConfirmBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(ApprovedDetails.this,MainActivity.class);
                        intent.putExtra("confirmBtn",2);
                        startActivity(intent);
                        /*
                       InProgress inProgress=new InProgress();
                       FragmentTransaction fm=getSupportFragmentManager().beginTransaction();
                       fm.replace(R.id.VPvsp,inProgress).commit();
*/
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