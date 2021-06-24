package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.streamlangarage.Common.Fragment.Earning;
import com.example.streamlangarage.R;

import Common.BankAccount;
import Common.MainActivity;

public class EarningActivity extends AppCompatActivity {

    private Button mManage,mConfirmWithdraw;
    ImageView leftarrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_earning);



        mManage =(Button)findViewById(R.id.manage_btn);
        mConfirmWithdraw =(Button)findViewById(R.id.confirm_withdraw);
        leftarrow=findViewById(R.id.ivleftarrow);
        leftarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EarningActivity.this, MainActivity.class));
            }
        });

        mConfirmWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EarningActivity.this, MainActivity.class));
            }
        });


        mManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EarningActivity.this, BankAccount.class));
            }
        });

    }
}