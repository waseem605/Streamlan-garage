package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlangarage.Common.VehicleSevice;
import com.example.streamlangarage.R;

import Common.Chat_Details;
import Common.MainActivity;
import Common.Self_Diagnose;

public class SubmittedDetail extends AppCompatActivity {

    private Button mAmendBtn,mDeleteBtn , mMessageBtn;
    TextView tvserv;
    LinearLayout samplecar;
    private ImageView mBackArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
      getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_submitted_detail);




        mAmendBtn = (Button)findViewById(R.id.amend_Btn);
        mDeleteBtn = (Button)findViewById(R.id.delete_btn);
        mMessageBtn = (Button)findViewById(R.id.btnvehicleservice);
        mBackArrow = (ImageView) findViewById(R.id.lefarrow);
        mMessageBtn.setText("Message");
        samplecar=findViewById(R.id.samplecar);
        samplecar.setBackgroundDrawable(getDrawable(R.drawable.top_round));




        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SubmittedDetail.this,MainActivity.class);
                intent.putExtra("ide",1);
                startActivity(intent);
                finish();
            }
        });

        mAmendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubmittedDetail.this, Self_Diagnose.class));
            }
        });

        mMessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubmittedDetail.this, Chat_Details.class));
            }
        });
    }
}