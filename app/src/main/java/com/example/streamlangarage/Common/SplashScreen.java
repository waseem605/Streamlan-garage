package com.example.streamlangarage.Common;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.streamlangarage.R;

public class SplashScreen extends AppCompatActivity {
    private Intent intent;
    private final static int SPLASH_TIME = 2000;

    SharedPreferences sharedPreferences;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
       getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {
            intent = new Intent(SplashScreen.this, GetStarted.class);
            startActivity(intent);
            finish();
/*
           sharedPreferences = getSharedPreferences("sharedPreferences",MODE_PRIVATE);
           boolean isFirstTime = sharedPreferences.getBoolean("firstTime",true);
           if(isFirstTime)
           {
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putBoolean("firstTime",false);
               editor.commit();

               intent=new Intent(Splash_Screen.this, Onboarding.class);
               startActivity(intent);
               finish();

           }else
           {


               intent = new Intent(Splash_Screen.this, SplashScreen.class);
               startActivity(intent);
               finish();
           }*/
        },SPLASH_TIME);

    }
}