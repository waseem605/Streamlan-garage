package com.example.streamlangarage.Common.Invoice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlangarage.Common.Fragments.Navigations.Submitted;
import com.example.streamlangarage.R;

import Common.MainActivity;

public class SelftDiagnose extends AppCompatActivity {
    private Button mSubmitDiag,mCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_selft_diagnose);
        mSubmitDiag =(Button)findViewById(R.id.submit_diag);
        mCancel =(Button)findViewById(R.id.Cancel_diag);

        mSubmitDiag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelftDiagnose.this, MainActivity.class));
            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelftDiagnose.this, MainActivity.class));
            }
        });

    }
}