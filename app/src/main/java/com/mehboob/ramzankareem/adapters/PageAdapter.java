package com.mehboob.ramzankareem.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mehboob.ramzankareem.fragments.Alarm;
import com.mehboob.ramzankareem.fragments.AsmaUlHassana;
import com.mehboob.ramzankareem.fragments.Azkar;
import com.mehboob.ramzankareem.fragments.PrayTime;
import com.mehboob.ramzankareem.fragments.Qibla;
import com.mehboob.ramzankareem.fragments.RamazanTiming;
import com.mehboob.ramzankareem.fragments.Tasbih;

public class PageAdapter extends FragmentPagerAdapter {
    int tabcount;
    int pos;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
        this.pos = pos;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new RamazanTiming();
            case 1:
                return new PrayTime();
//            case 2:
//                return new Alarm();
//            case 3:
//                return new Qibla();
            case 2:
                return new Tasbih();
            case 3:
                return new Azkar();
            case 4:
                return new AsmaUlHassana();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
