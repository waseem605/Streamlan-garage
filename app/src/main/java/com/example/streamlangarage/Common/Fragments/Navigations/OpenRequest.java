package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.streamlangarage.R;

import Common.OpenRequestDetails;
import Common.Self_Diagnose;


public class OpenRequest extends Fragment {
    TextView mjob,mjobno,status,statustype, mPreferedDate, mDateTime;
    Button btnopenrequest;
    LinearLayout llopenrequest;
    RelativeLayout mRelative;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_open_request, container, false);


        mDateTime = (TextView)v.findViewById(R.id.date_time_s);
        mDateTime.setText("21-03-2020 - 28-03-2020 (Evening)");
        mPreferedDate = (TextView)v.findViewById(R.id.tv);
        mPreferedDate.setText("Preferred Service Date Range");
        llopenrequest=v.findViewById(R.id.llopenrequest);
        mjob=(TextView)v.findViewById(R.id.job);
        mjob.setVisibility(View.INVISIBLE);
        mjobno=(TextView)v.findViewById(R.id.jobno);
        mjobno.setVisibility(View.INVISIBLE);
        status=v.findViewById(R.id.status);
        status.setVisibility(View.INVISIBLE);
        statustype=v.findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        btnopenrequest=(Button)v.findViewById(R.id.btnopenrequest);

        btnopenrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpenRequest.this.getActivity(), OpenRequestDetails.class));
            }
        });
        llopenrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpenRequest.this.getActivity(), Self_Diagnose.class));

            }
        });

        return v;
    }
}