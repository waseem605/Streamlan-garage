package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.streamlangarage.R;

import Common.ProgressRequestDetails;

public class InProgress extends Fragment {
    TextView status,statustype;
   LinearLayout btnlinearLayout,llopenrequest;
   RelativeLayout scheduleRL;
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
        llopenrequest=v.findViewById(R.id.llopenrequest);
        status=v.findViewById(R.id.status);
        status.setVisibility(View.INVISIBLE);
        statustype=v.findViewById(R.id.statustype);
        statustype.setVisibility(View.INVISIBLE);
        scheduleRL=(RelativeLayout)v.findViewById(R.id.Rlsamplecarschedule);
        scheduleRL.setBackgroundDrawable(getActivity().getDrawable(R.drawable.white_background_b_round));
        llopenrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InProgress.this.getActivity(), ProgressRequestDetails.class));
            }
        });
        return v;
    }
}