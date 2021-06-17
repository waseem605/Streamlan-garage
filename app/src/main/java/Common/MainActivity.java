package Common;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_main_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container,new QutationManagement()).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId()) {
                    case R.id.quotes_nav:
                        fragment = new QutationManagement();
                        break;

                    case R.id.booking_nav:
                        fragment = new VehicleServiceProgress();
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
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, fragment).commit();
                return true;
            }


        });


    }
}