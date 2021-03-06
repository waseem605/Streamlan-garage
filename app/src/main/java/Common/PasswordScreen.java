package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlangarage.Common.VehicleSevice;
import com.example.streamlangarage.R;

public class PasswordScreen extends AppCompatActivity {

    private Button mConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_password_screen);

        mConfirmPassword = (Button)findViewById(R.id.password_confirmBtn);

        mConfirmPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasswordScreen.this, ProfileStep1.class);
                startActivity(intent);
            }
        });

    }
}