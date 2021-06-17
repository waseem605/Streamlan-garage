package com.example.streamlangarage.Common.Fragments.Navigations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.streamlangarage.R;

public class InProgress extends Fragment {
   LinearLayout btnlinearLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_in_progress, container, false);
        btnlinearLayout=(LinearLayout)v.findViewById(R.id.llbtnsampleopenrequest);
        btnlinearLayout.setVisibility(View.INVISIBLE);
        return v;
    }
}