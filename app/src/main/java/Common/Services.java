package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.streamlangarage.R;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));
        setContentView(R.layout.activity_sevices);
    }
}