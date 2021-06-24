package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class ProgressRequestDetails extends AppCompatActivity {
    TextView statustype,mScheduleServ;
    Button vehicleservice,mCompleteBtn,mCancelBtn;
    private ImageView mBackArrow;
    LinearLayout samplecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_progress_request_details);
        mCompleteBtn=(Button)findViewById(R.id.complete_PRD);
        mCancelBtn=(Button)findViewById(R.id.cancel_PRD);
        mScheduleServ = (TextView)findViewById(R.id.tv);
        mBackArrow =(ImageView)findViewById(R.id.lefarrow_PR);

        mScheduleServ.setText("Scheduled Service Repair Date");
        statustype=findViewById(R.id.statustype);
        statustype.setText("In Progress");
        statustype.setTextColor(getResources().getColor(R.color.Back_color));
        samplecar=findViewById(R.id.samplecar);
        samplecar.setBackgroundDrawable(getDrawable(R.drawable.top_round));
        vehicleservice=findViewById(R.id.btnvehicleservice);



        vehicleservice.setText("Message");
        vehicleservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProgressRequestDetails.this,Chat_Details.class));
            }
        });

        mCompleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProgressRequestDetails.this,MainActivity.class));
            }
        });


        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProgressRequestDetails.this,MainActivity.class));
            }
        });

    }
}