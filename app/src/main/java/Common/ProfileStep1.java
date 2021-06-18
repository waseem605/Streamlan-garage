package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class ProfileStep1 extends AppCompatActivity {

    private RelativeLayout mContinue;
    private ImageView mGarageImage;
    AutoCompleteTextView mCountry;
    private LinearLayout mUploadImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step1);
        mGarageImage = (ImageView)findViewById(R.id.garage_image);
        mContinue = (RelativeLayout) findViewById(R.id.continuebtn);

        mUploadImage = (LinearLayout)findViewById(R.id.upload_garage_img);
        mCountry = findViewById(R.id.dropdown_country);

        //selectCountry();

        mUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mGarageImage.setImageResource();
            }
        });

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileStep1.this,ProfileStep2.class));
            }
        });
    }

    public void selectCountry()
    {
         final String[] country={"USA","UK","Canada"};

        //ArrayAdapter arrayAdapter =new ArrayAdapter(this,R.layout.country_dropdown_sample,country);
        ArrayAdapter arrayAdapter =new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,country);
        mCountry.setText((CharSequence) arrayAdapter.getItem(0),false);
        mCountry.setAdapter(arrayAdapter);


    }

}