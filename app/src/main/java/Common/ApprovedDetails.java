package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class ApprovedDetails extends AppCompatActivity {
   Button btn;
   TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approved_details);
        btn=(Button)findViewById(R.id.btnvehicleservice);
        tv=(TextView)findViewById(R.id.serv);
        tv.setText("Approved");
        tv.setTextColor(getResources().getColor(R.color.green));
        btn.setText("Message");
    }
}