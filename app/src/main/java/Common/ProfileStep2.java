package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.example.streamlangarage.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ProfileStep2 extends AppCompatActivity {

    private Spinner mYear;
    private RelativeLayout mContinue;
    private ImageView mBackLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step2);
        mContinue = (RelativeLayout) findViewById(R.id.continue_btn_step);
        mYear = (Spinner)findViewById(R.id.Years);
        mBackLink = (ImageView)findViewById(R.id.back_arrow_sig);


        String[]year= {"2013","2014","2015","2016"};
        ArrayList<String> yearList = new ArrayList<String>(Arrays.asList(year));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,yearList);
        mYear.setAdapter(arrayAdapter);




        mBackLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileStep2.this,ProfileStep1.class));

            }
        });

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileStep2.this,ProfileStep3.class));

            }
        });


    }
}