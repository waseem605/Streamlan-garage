package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.streamlangarage.R;

public class ProfileStep2 extends AppCompatActivity {

    private RelativeLayout mContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step2);
        mContinue = (RelativeLayout) findViewById(R.id.continue_btn_step);

        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileStep2.this,ProfileStep3.class));

            }
        });


    }
}