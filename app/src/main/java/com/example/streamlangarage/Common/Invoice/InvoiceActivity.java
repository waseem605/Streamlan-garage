package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlangarage.Common.Fragments.Navigations.Paid;
import com.example.streamlangarage.R;

import Common.MainActivity;

public class InvoiceActivity extends AppCompatActivity {
    TextView tvtime;
    Button btnvehicleservice;
    private ImageView mBackArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
       getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_invoice);

        mBackArrow = (ImageView)findViewById(R.id.toolbarBank_invoice);
        tvtime=findViewById(R.id.tvtime);

        tvtime.setText("Job id: 11545455");
        btnvehicleservice=findViewById(R.id.btnvehicleservice);
        btnvehicleservice.setText("BMW X5 2019");


        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvoiceActivity.this, MainActivity.class));


            }
        });
    }
}