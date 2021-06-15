package com.example.streamlangarage.Common.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.streamlangarage.Common.Fragments.Navigations.Approved;
import com.example.streamlangarage.Common.Fragments.Navigations.OpenRequest;
import com.example.streamlangarage.Common.Fragments.Navigations.Submitted;

import org.jetbrains.annotations.NotNull;

public class QutatationManagementAdapter extends FragmentPagerAdapter {
    public QutatationManagementAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {


            case 0:
                return new OpenRequest();
            case 1:
                return new Submitted();
            case 2:
                return new Approved();
            default:
                return new OpenRequest();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if(position==0)
        {
            title="OPEN REQUEST";
        }
        if(position==1)
        {
            title="SUBMITTED";
        }
        if(position==2)
        {
            title="APPROVED";
        }
        return title;
    }
}
