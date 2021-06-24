package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.Common.Adapters.VehicleprogressAdapter;
import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

import Common.Chat_Details;

public class VehicleServiceProgress extends Fragment {
    private static ViewPager mviewPager;
    VehicleprogressAdapter vehicleprogressAdapter;
    private ImageView mCombined_shape;
    private static final String CONFIRM_BTN="fragmentId";



    private TabLayout mtabLayout;
    private TextView mOnline;
    private Switch mSwitch;


    public static VehicleServiceProgress vehicleService(int v)
    {
        Bundle bundle =new Bundle();
        bundle.putInt(CONFIRM_BTN,v);
        VehicleServiceProgress vsp = new VehicleServiceProgress();
        vsp.setArguments(bundle);
        return vsp;

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        requireActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_vehicle_service_progress, container, false);


        mtabLayout=(TabLayout)v.findViewById(R.id.tbvsp);
        mviewPager=(ViewPager)v.findViewById(R.id.VPvsp);
        mCombined_shape =(ImageView)v.findViewById(R.id.combined_shape_V);


        int Vsp= getArguments().getInt(CONFIRM_BTN);

        vehicleprogressAdapter=new VehicleprogressAdapter(getActivity().getSupportFragmentManager());
        mviewPager.setAdapter(vehicleprogressAdapter);
        receivedView(Vsp);

        mtabLayout.setupWithViewPager(mviewPager);


        mCombined_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VehicleServiceProgress.this.getActivity(), Chat_Details.class));
            }
        });




        return v;
    }

    public static void receivedView(int v)
    {
        mviewPager.setCurrentItem(v);

    }


}