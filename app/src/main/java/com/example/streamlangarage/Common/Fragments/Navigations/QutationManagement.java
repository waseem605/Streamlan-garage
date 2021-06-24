package com.example.streamlangarage.Common.Fragments.Navigations;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.streamlangarage.Common.Adapters.QutatationManagementAdapter;
import com.example.streamlangarage.R;
import com.google.android.material.tabs.TabLayout;

import java.io.Serializable;

import Common.Chat_Details;

public class  QutationManagement extends Fragment {
    QutatationManagementAdapter qutatationManagementAdapter;

    private static final String fragment_Id="fragmentId";

    private TabLayout mtabLayout;
    private static ViewPager mviewPager;
    private ImageView mCombined_shape;
    private Switch mSwitch;
    private TextView mOnline;
    private Toolbar toolbar;

    public static QutationManagement qutationManagement(int i)
    {
        Bundle bundle =new Bundle();
        bundle.putInt(fragment_Id,i);
        QutationManagement qm =new QutationManagement();
        qm.setArguments(bundle);
        return qm;
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
        View v= inflater.inflate(R.layout.fragment_qutation_management, container, false);

        mCombined_shape = (ImageView)v.findViewById(R.id.combined_shape);
        mtabLayout=(TabLayout)v.findViewById(R.id.endtb);
        mviewPager=(ViewPager)v.findViewById(R.id.VPqm);
        mOnline = (TextView)v.findViewById(R.id.online_tx);


        mSwitch = (Switch)v.findViewById(R.id.thumb_switch_q);
        mSwitch.setChecked(true);

        qutatationManagementAdapter=new QutatationManagementAdapter(getActivity().getSupportFragmentManager());


        // pass id
        int qm= getArguments().getInt(fragment_Id);
        mviewPager.setAdapter(qutatationManagementAdapter);
        mtabLayout.setupWithViewPager(mviewPager);
        receivedView(qm);


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

        mCombined_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QutationManagement.this.getActivity(), Chat_Details.class));
            }
        });




         return v;
    }


    public static void receivedView(int i)
    {
        mviewPager.setCurrentItem(i);

    }

}