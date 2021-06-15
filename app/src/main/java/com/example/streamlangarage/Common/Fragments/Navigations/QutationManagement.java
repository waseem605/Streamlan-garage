package com.example.streamlangarage.Common.Fragments.Navigations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

public class QutationManagement extends Fragment {
    QutatationManagementAdapter qutatationManagementAdapter;
    private TabLayout mtabLayout;
    private ViewPager mviewPager;
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
        qutatationManagementAdapter=new QutatationManagementAdapter(getActivity().getSupportFragmentManager());
        mviewPager.setAdapter(qutatationManagementAdapter);
        mtabLayout.setupWithViewPager(mviewPager);
         return v;
    }
}