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
import android.widget.Spinner;
import android.widget.TextView;

import com.example.streamlangarage.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ProfileStep1 extends AppCompatActivity {

    private RelativeLayout mContinue;
    private ImageView mGarageImage;
    AutoCompleteTextView mCountry;
    private LinearLayout mUploadImage;
    private Spinner mcountrySpinner ,mStateSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step1);
        mGarageImage = (ImageView)findViewById(R.id.garage_image);
        mContinue = (RelativeLayout) findViewById(R.id.continuebtn);

        mcountrySpinner =(Spinner)findViewById(R.id.country_names);
        mStateSpinner =(Spinner)findViewById(R.id.state);
        mUploadImage = (LinearLayout)findViewById(R.id.upload_garage_img);
        mCountry = (AutoCompleteTextView) findViewById(R.id.dropdown_country);

        selectCountry();

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
          String[] country={"USA","UK","Canada"};

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(country));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        mcountrySpinner.setAdapter(arrayAdapter);

        String[] state={"Dubai","USA","UK","Canada"};

        ArrayList<String> List_state = new ArrayList<String>(Arrays.asList(state));
        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,List_state);
        mStateSpinner.setAdapter(stateAdapter);

    }

}