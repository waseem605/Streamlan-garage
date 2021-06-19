package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlangarage.Common.Fragment.Earning;
import com.example.streamlangarage.R;

import Common.BankAccount;

public class EarningActivity extends AppCompatActivity {

    private Button mManage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earning);
        mManage =(Button)findViewById(R.id.manage_btn);


        mManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EarningActivity.this, BankAccount.class));
            }
        });

    }
}