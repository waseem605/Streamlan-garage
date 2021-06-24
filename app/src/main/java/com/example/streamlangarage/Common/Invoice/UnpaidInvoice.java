package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

import Common.MainActivity;

public class UnpaidInvoice extends AppCompatActivity {

    private ImageView mBackArrow;
    private Button carmodel;
    private TextView mCancel,tvtime;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_unpaid_invoice);



        mBackArrow = (ImageView)findViewById(R.id.toolbarBank);
        mCancel = (TextView) findViewById(R.id.cancel);

        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnpaidInvoice.this, MainActivity.class));


            }
        });
    }
}