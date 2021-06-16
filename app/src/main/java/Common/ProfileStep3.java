package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.streamlangarage.R;

public class ProfileStep3 extends AppCompatActivity {

    private Button mAprovalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_step3);
        mAprovalBtn=(Button)findViewById(R.id.aproval_btn);
    }
}