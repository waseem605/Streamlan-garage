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

public class Self_Diagnose extends AppCompatActivity {
    TextView status,statustype,changetype,mDateTime , mPreferedDate;
    Button btnopenrequest ,mSubmitQuote,mCancel;
    LinearLayout samplecar;
    ImageView mBackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
      getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_self_diagnose);

        mSubmitQuote =(Button)findViewById(R.id.btnsubmit);
        mCancel =(Button)findViewById(R.id.btncncl);
        mBackArrow =(ImageView)findViewById(R.id.lefarrow);

        mPreferedDate = (TextView)findViewById(R.id.tv);
        mPreferedDate.setText("Preferred Service Date Range");
        mDateTime = (TextView)findViewById(R.id.date_time_s);
        mDateTime.setText("21-03-2020 - 28-03-2020 (Evening)");

        status=findViewById(R.id.status);
        status.setVisibility(View.INVISIBLE);
        statustype=findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        changetype=findViewById(R.id.serv);
        changetype.setText("Diagnosis");
        btnopenrequest=findViewById(R.id.btnvehicleservice);
        btnopenrequest.setText("Vehical Diagnosis");
        samplecar=findViewById(R.id.samplecar);
        samplecar.setBackgroundDrawable(getDrawable(R.drawable.top_round));


        mSubmitQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Self_Diagnose.this,MainActivity.class);
                intent.putExtra("ide",1);
                startActivity(intent);
                finish();
            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Self_Diagnose.this,MainActivity.class);
                intent.putExtra("ide",0);
                startActivity(intent);
                finish();
            }
        });
        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Self_Diagnose.this,MainActivity.class);
                intent.putExtra("ide",0);
                startActivity(intent);
                finish();
            }
        });

    }
}