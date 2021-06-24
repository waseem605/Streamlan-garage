package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.streamlangarage.R;

public class Chat extends AppCompatActivity {
    LinearLayout samplemessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Back_color));

        setContentView(R.layout.activity_chat);
        samplemessage=findViewById(R.id.samplemessage);
        samplemessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Chat.this,Chat_Details.class));
            }
        });
    }
}