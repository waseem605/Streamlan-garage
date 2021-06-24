package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlangarage.Common.Invoice.UnpaidInvoice;
import com.example.streamlangarage.R;


public class Completed extends Fragment {

    private Button mInvoice;
    TextView status,statustype ,mCompleteServ , mjob ,mjobno;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View v=inflater.inflate(R.layout.fragment_completed, container, false);
      mInvoice =(Button)v.findViewById(R.id.btnopenrequest);
        status=v.findViewById(R.id.status);
        mCompleteServ=v.findViewById(R.id.tv);

        mCompleteServ.setText("Competed Service Repair Date");
        status.setVisibility(View.INVISIBLE);
        statustype=v.findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        mjob=(TextView)v.findViewById(R.id.job);
        mjob.setVisibility(View.INVISIBLE);
        mjobno=(TextView)v.findViewById(R.id.jobno);
        mjobno.setVisibility(View.INVISIBLE);
      mInvoice.setText("Invoce");
      mInvoice.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(Completed.this.getActivity(), UnpaidInvoice.class));
          }
      });


      return v;
    }
}