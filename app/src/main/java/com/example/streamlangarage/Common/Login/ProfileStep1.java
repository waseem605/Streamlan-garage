package com.example.streamlangarage.Common.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.streamlangarage.R;

public class ProfileStep1 extends AppCompatActivity {

    private ImageView mGarageImage;
    private LinearLayout mUploadImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step1);
        mGarageImage = (ImageView)findViewById(R.id.garage_image);
        mUploadImage = (LinearLayout)findViewById(R.id.upload_garage_img);

        mUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mGarageImage.setImageResource();
            }
        });
    }
}