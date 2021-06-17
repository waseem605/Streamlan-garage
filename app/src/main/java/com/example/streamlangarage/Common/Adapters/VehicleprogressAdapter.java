package com.example.streamlangarage.Common.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.streamlangarage.Common.Fragments.Navigations.Approved;
import com.example.streamlangarage.Common.Fragments.Navigations.Completed;
import com.example.streamlangarage.Common.Fragments.Navigations.InProgress;
import com.example.streamlangarage.Common.Fragments.Navigations.OpenRequest;
import com.example.streamlangarage.Common.Fragments.Navigations.Paid;
import com.example.streamlangarage.Common.Fragments.Navigations.Submitted;

import org.jetbrains.annotations.NotNull;

public class VehicleprogressAdapter extends FragmentPagerAdapter {
    public VehicleprogressAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {


            case 0:
                return new InProgress();
            case 1:
                return new Completed();
            case 2:
                return new Paid();
            default:
                return new InProgress();
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
            title="IN PROGRESS";
        }
        if(position==1)
        {
            title="COMPLETED";
        }
        if(position==2)
        {
            title="PAID";
        }
        return title;
    }
}
