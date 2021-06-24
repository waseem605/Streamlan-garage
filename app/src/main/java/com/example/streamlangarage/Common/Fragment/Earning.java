package com.example.streamlangarage.Common.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.example.streamlangarage.Common.Invoice.EarningActivity;
import com.example.streamlangarage.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Earning extends Fragment {

    private Spinner mView;
    private RelativeLayout mWithdrawActivity;

    public Earning() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.silver));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_earning, container, false);

        mView=(Spinner)view.findViewById(R.id.dropdown_view_spinner);
        mWithdrawActivity=(RelativeLayout)view.findViewById(R.id.digital_RL);

      drop();

        return view;
    }

    private void drop()
    {

        mWithdrawActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Earning.this.getActivity(), EarningActivity.class));
            }
        });


        String[] barChart={"Day View","Week View","Monthly View","Quarter View","Yearly View"};

        ArrayList<String> barChartList = new ArrayList<String>(Arrays.asList(barChart));
        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(getActivity(),R.layout.support_simple_spinner_dropdown_item,barChartList);
        mView.setAdapter(stateAdapter);


    }
}