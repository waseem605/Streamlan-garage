package Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.streamlangarage.R;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount extends AppCompatActivity {

    private Spinner mcountrySpinner;
    private Button mConfirmBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        mcountrySpinner = (Spinner)findViewById(R.id.coutry_names_bank);
        mConfirmBtn = (Button)findViewById(R.id.bank_confirm_btn);


        mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        String[] country={"USA","UK","Canada"};

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(country));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        mcountrySpinner.setAdapter(arrayAdapter);
    }
}