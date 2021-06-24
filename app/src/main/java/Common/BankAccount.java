package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.streamlangarage.Common.Invoice.EarningActivity;
import com.example.streamlangarage.R;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount extends AppCompatActivity {

    private Spinner mcountrySpinner;
    private Button mConfirmBtn;
    private ImageView mBackArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.silver));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_bank_account);
        mcountrySpinner = (Spinner)findViewById(R.id.coutry_names_bank);
        mConfirmBtn = (Button)findViewById(R.id.bank_confirm_btn);
        mBackArrow = (ImageView)findViewById(R.id.toolbarBank);


        mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(BankAccount.this, EarningActivity.class));
            }
        });

        mBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(BankAccount.this, EarningActivity.class));
            }
        });



        String[] country={"First Bank","Second Bank","Third Bank"};

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(country));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        mcountrySpinner.setAdapter(arrayAdapter);
    }
}