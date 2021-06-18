package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.streamlangarage.Common.Invoice.UnpaidInvoice;
import com.example.streamlangarage.R;


public class Completed extends Fragment {

    private Button mInvoice;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View v=inflater.inflate(R.layout.fragment_completed, container, false);
      mInvoice =(Button)v.findViewById(R.id.btnopenrequest);

      mInvoice.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(Completed.this.getActivity(), UnpaidInvoice.class));
          }
      });


      return v;
    }
}