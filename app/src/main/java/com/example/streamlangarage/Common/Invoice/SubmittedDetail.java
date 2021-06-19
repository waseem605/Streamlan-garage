package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlangarage.Common.VehicleSevice;
import com.example.streamlangarage.R;

import Common.Chat_Details;

public class SubmittedDetail extends AppCompatActivity {

    private Button mAmendBtn,mDeleteBtn , mMessageBtn;
    TextView tvserv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submitted_detail);
        mAmendBtn = (Button)findViewById(R.id.amend_Btn);
        mDeleteBtn = (Button)findViewById(R.id.delete_btn);
        mMessageBtn = (Button)findViewById(R.id.btnvehicleservice);





        mAmendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SubmittedDetail.this, VehicleSevice.class));
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