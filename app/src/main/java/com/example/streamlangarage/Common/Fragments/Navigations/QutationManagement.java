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
import android.widget.Toolbar;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

public class QutationManagement extends Fragment {
    QutatationManagementAdapter qutatationManagementAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;
    private Switch mSwitch;
    private TextView mOnline;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_qutation_management, container, false);
        mtabLayout=(TabLayout)v.findViewById(R.id.endtb);
        mviewPager=(ViewPager)v.findViewById(R.id.VPqm);
        mSwitch = (Switch)v.findViewById(R.id.thumb_switch_q);
        mOnline = (TextView)v.findViewById(R.id.online_tx);
        mOnline.setVisibility(View.INVISIBLE);

        qutatationManagementAdapter=new QutatationManagementAdapter(getActivity().getSupportFragmentManager());
        mviewPager.setAdapter(qutatationManagementAdapter);
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