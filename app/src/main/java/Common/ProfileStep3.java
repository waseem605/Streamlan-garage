package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.streamlangarage.R;

public class ProfileStep3 extends AppCompatActivity {

    private Button mAprovalBtn;

    private ImageView mBacklink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step3);
        mAprovalBtn=(Button)findViewById(R.id.aproval_btn);
        mBacklink=(ImageView)findViewById(R.id.back_arrow_sign);

        mAprovalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileStep3.this,VerifySuccessfully.class));
            }
        });

        mBacklink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileStep3.this,ProfileStep2.class));
            }
        });
    }
}