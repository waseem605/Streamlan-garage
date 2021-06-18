package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

public class UnpaidInvoice extends AppCompatActivity {

    private ImageView mBackArrow;
    private TextView mCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unpaid_invoice);
        mBackArrow = (ImageView)findViewById(R.id.toolbarBank);
        mCancel = (TextView) findViewById(R.id.cancel);


        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}