package com.example.streamlangarage.Common.Fragments.Navigations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.Common.Adapters.VehicleprogressAdapter;
import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

public class VehicleServiceProgress extends Fragment {
    VehicleprogressAdapter vehicleprogressAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;
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
        vehicleprogressAdapter=new VehicleprogressAdapter(getActivity().getSupportFragmentManager());
        mviewPager.setAdapter(vehicleprogressAdapter);
        mtabLayout.setupWithViewPager(mviewPager);
        return v;
    }
}