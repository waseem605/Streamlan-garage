package Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.Common.Fragment.UserProfile;
import com.example.streamlangarage.Common.Fragments.Navigations.OpenRequest;
import com.example.streamlangarage.Common.Fragments.Navigations.QutationManagement;
import com.example.streamlangarage.Common.Fragments.Navigations.Submitted;
import com.example.streamlangarage.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OpenRequestDetails extends AppCompatActivity {
    TextView status,statustype , mDateTime, mPreferedDate;
    LinearLayout samplecar;
    private ImageView mBackArrow;
    Button mSubmitquote,mCancel;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_open_request_details);
        mBackArrow = (ImageView)findViewById(R.id.leftarrow);
        mCancel = (Button)findViewById(R.id.cancel_qoute);



        mPreferedDate = (TextView)findViewById(R.id.tv);
        mPreferedDate.setText("Preferred Service Date Range");
        mDateTime = (TextView)findViewById(R.id.date_time_s);
        mDateTime.setText("21-03-2020 - 28-03-2020 (Evening)");
        status=findViewById(R.id.status);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);
        status.setVisibility(View.INVISIBLE);
        statustype=findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        samplecar=findViewById(R.id.samplecar);
        samplecar.setBackgroundDrawable(getDrawable(R.drawable.top_round));
        mSubmitquote=findViewById(R.id.submit_quote);


        mSubmitquote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent intent =new Intent(OpenRequestDetails.this,MainActivity.class);
              intent.putExtra("ide",1);
              startActivity(intent);
              finish();

            }
        });

        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(OpenRequestDetails.this,MainActivity.class);
                intent.putExtra("ide",0);
                startActivity(intent);
                finish();
            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(OpenRequestDetails.this,MainActivity.class);
                intent.putExtra("ide",0);
                startActivity(intent);
                finish();
            }
        });
    }
}