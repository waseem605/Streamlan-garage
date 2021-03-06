package com.example.streamlangarage.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlangarage.R;

import Common.Login;

public class GetStarted extends AppCompatActivity {

    private Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));
        setContentView(R.layout.activity_get_started);
        getStarted = (Button)findViewById(R.id.get_start_btn);

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetStarted.this, Login.class));
            }
        });


    }
}