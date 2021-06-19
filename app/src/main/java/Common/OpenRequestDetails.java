package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.streamlangarage.R;

public class OpenRequestDetails extends AppCompatActivity {

    private Button mSubmitQouteBtn, mCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_request_details);
        mCancel = (Button)findViewById(R.id.cancel_qoute);
        mSubmitQouteBtn = (Button)findViewById(R.id.submit_quote);

        mSubmitQouteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(OpenRequestDetails.this,));
            }
        });

    }
}