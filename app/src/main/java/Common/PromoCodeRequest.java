package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.streamlangarage.R;

public class PromoCodeRequest extends AppCompatActivity {

    private ImageView mBackArrow;
    private Button mSubmitPromo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_promo_code_request);
        mBackArrow =(ImageView) findViewById(R.id.back_arrow_RP);
        mSubmitPromo =(Button)findViewById(R.id.submit_promo);



        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PromoCodeRequest.this,PromoCodeHistory.class));
            }
        });

        mSubmitPromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PromoCodeRequest.this,PromoCodeHistory.class));
            }
        });

    }
}