package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlangarage.R;

public class OTP_Verify extends AppCompatActivity {

    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify);
        mBtn = (Button)findViewById(R.id.verify_number_btn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OTP_Verify.this, VerifySuccessfully.class);
                startActivity(intent);
            }
        });
    }
}