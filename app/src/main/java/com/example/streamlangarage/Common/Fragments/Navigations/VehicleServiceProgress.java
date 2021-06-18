package com.example.streamlangarage.Common.Fragments.Navigations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.Common.Adapters.VehicleprogressAdapter;
import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

public class VehicleServiceProgress extends Fragment {
    VehicleprogressAdapter vehicleprogressAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;
    private TextView mOnline;
    private Switch mSwitch;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_vehicle_service_progress, container, false);
        mtabLayout=(TabLayout)v.findViewById(R.id.tbvsp);
        mviewPager=(ViewPager)v.findViewById(R.id.VPvsp);
        mSwitch =(Switch)v.findViewById(R.id.thumb_switch_q);
        mOnline = (TextView)v.findViewById(R.id.online_tx);
        mOnline.setVisibility(View.INVISIBLE);
        vehicleprogressAdapter=new VehicleprogressAdapter(getActivity().getSupportFragmentManager());
        mviewPager.setAdapter(vehicleprogressAdapter);
        mtabLayout.setupWithViewPager(mviewPager);


        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    mOnline.setVisibility(View.VISIBLE);
                }else
                {
                    mOnline.setVisibility(View.INVISIBLE);
                }
            }
        });




        return v;
    }
}