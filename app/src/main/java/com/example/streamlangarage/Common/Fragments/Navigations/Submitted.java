package com.example.streamlangarage.Common.Fragments.Navigations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.streamlangarage.R;


public class Submitted extends Fragment {

    TextView mservice,mdiagnose;
    Button mbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_open_request, container, false);
        mservice=(TextView)v.findViewById(R.id.service);
        mservice.setVisibility(View.INVISIBLE);
        mdiagnose=(TextView)v.findViewById(R.id.diagnose);
        mdiagnose.setVisibility(View.INVISIBLE);
        mbtn=(Button)v.findViewById(R.id.btnopenrequest);
        mbtn.setText("View Details");
        return v;
    }
}