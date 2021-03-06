package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlangarage.R;

import Common.ApprovedDetails;

public class Approved extends Fragment {
    TextView mjob,mjobno,status,statustype , mPreferedDate;
    Button mbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.silver));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_open_request, container, false);
        mbtn=(Button)v.findViewById(R.id.btnopenrequest);



        mPreferedDate = (TextView)v.findViewById(R.id.tv);
        mPreferedDate.setText("Scheduled Service Repair Date");
        mbtn.setText("View Details");
        mjob=(TextView)v.findViewById(R.id.job);
        mjob.setVisibility(View.INVISIBLE);
        mjobno=(TextView)v.findViewById(R.id.jobno);
        mjobno.setVisibility(View.INVISIBLE);
        status=v.findViewById(R.id.status);
        status.setVisibility(View.INVISIBLE);
        statustype=v.findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Approved.this.getActivity(), ApprovedDetails.class));
            }
        });
        return v;
    }
}