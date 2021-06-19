package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class ApprovedDetails extends AppCompatActivity {
   Button btn;
   TextView statustype;
   ImageView mBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approved_details);
        btn=(Button)findViewById(R.id.btnvehicleservice);
        mBack = (ImageView) findViewById(R.id.lefarrow);
        statustype=findViewById(R.id.statustype);
        statustype.setText("Approved");
        statustype.setTextColor(getResources().getColor(R.color.green));
        btn.setText("Message");


        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ApprovedDetails.this,MainActivity.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ApprovedDetails.this,Chat_Details.class));
            }
        });

    }
}