package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.streamlangarage.R;

public class Self_Diagnose extends AppCompatActivity {
    TextView status,statustype,changetype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnose);
        status=findViewById(R.id.status);
        status.setVisibility(View.INVISIBLE);
        statustype=findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        changetype=findViewById(R.id.serv);
        changetype.setText("Diagnosis");

    }
}