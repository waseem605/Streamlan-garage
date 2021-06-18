package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class PromoCodeHistory extends AppCompatActivity {

    private TextView mPromocall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo_code_history);

        mPromocall =(TextView)findViewById(R.id.promo_tbn);
        mPromocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PromoCodeHistory.this,PromoCodeRequest.class));
            }
        });


    }
}