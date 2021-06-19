package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class ProgressRequestDetails extends AppCompatActivity {
    TextView statustype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_request_details);
        statustype=findViewById(R.id.statustype);
        statustype.setText("In Progress");
        statustype.setTextColor(getResources().getColor(R.color.Back_color));
    }
}