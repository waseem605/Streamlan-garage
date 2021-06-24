package Common;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.streamlangarage.Common.Fragment.Earning;
import com.example.streamlangarage.Common.Fragment.UserProfile;
import com.example.streamlangarage.Common.Fragments.Navigations.Notification;
import com.example.streamlangarage.Common.Fragments.Navigations.QutationManagement;
import com.example.streamlangarage.Common.Fragments.Navigations.VehicleServiceProgress;
import com.example.streamlangarage.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Intent intent;
    int ConfirmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        setContentView(R.layout.activity_main);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // id from buttonListener activity
        Intent intent = getIntent();
        int containerFM =intent.getIntExtra("ide",0);

        fromApproveDetail();

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, QutationManagement.qutationManagement(containerFM)).addToBackStack(null).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

                Fragment fragment=null;
                switch (item.getItemId()) {
                    case R.id.quotes_nav:
                        fragment =  QutationManagement.qutationManagement(containerFM);
                        break;

                    case R.id.booking_nav:
                        fragment =  VehicleServiceProgress.vehicleService(ConfirmBtn);

                        break;

                    case R.id.earning_nav:
                        fragment = new Earning();
                        break;

                    case R.id.notification_nav:
                        fragment = new Notification();
                        break;

                    case R.id.user_nav:
                        fragment = new UserProfile();
                        break;
                }
                assert fragment != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, fragment).addToBackStack(null).commit();
                return true;
            }
        });


    }

    public void fromApproveDetail()
    {
        intent =getIntent();
         ConfirmBtn=intent.getIntExtra("confirmBtn",0);


    }
}