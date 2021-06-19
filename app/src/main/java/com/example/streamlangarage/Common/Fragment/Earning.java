package com.example.streamlangarage.Common.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.streamlangarage.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Earning extends Fragment {

    private Spinner mView;

    public Earning() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_earning, container, false);

        mView=(Spinner)view.findViewById(R.id.dropdown_view_spinner);

      drop();

        return view;
    }

    private void drop()
    {
        String[] barChart={"Day View","Week View","Monthly View","Quarter View","Yearly View"};

        ArrayList<String> barChartList = new ArrayList<String>(Arrays.asList(barChart));
        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(getActivity(),R.layout.support_simple_spinner_dropdown_item,barChartList);
        mView.setAdapter(stateAdapter);
    }
}