package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlangarage.Common.Invoice.SubmittedDetail;
import com.example.streamlangarage.R;


public class Submitted extends Fragment {
    TextView mjob,mjobno,jobcalculate;
    Button mbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_open_request, container, false);
        mbtn=(Button)v.findViewById(R.id.btnopenrequest);
        mbtn.setText("View Details");
        mjob=(TextView)v.findViewById(R.id.job);
        mjob.setVisibility(View.INVISIBLE);
        mjobno=(TextView)v.findViewById(R.id.jobno);
        mjobno.setVisibility(View.INVISIBLE);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Submitted.this.getActivity(), SubmittedDetail.class));
            }
        });
        return v;
    }
}