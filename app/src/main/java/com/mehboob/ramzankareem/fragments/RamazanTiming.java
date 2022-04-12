package com.mehboob.ramzankareem.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.mehboob.ramzankareem.R;
import com.mehboob.ramzankareem.adapters.PrayerAdapter;
import com.mehboob.ramzankareem.models.PrayerModel;

import java.util.ArrayList;

public class RamazanTiming extends Fragment {
RecyclerView recyclerView;
PrayerAdapter adapter;
ArrayList<PrayerModel> list;
    private AdView adView;
    AdRequest adRequest;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_ramazan_timing, container, false);
        adView = (AdView) view. findViewById(R.id.ad_view_ramzan);
        MobileAds.initialize(requireContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        recyclerView=view.findViewById(R.id.prayerRecycler);
     list=new ArrayList<>();
     list.add(new PrayerModel("فجر","2","2","-","-","-","-"));
     list.add(new PrayerModel("ظہر","4","4","2","2","-","-"));
     list.add(new PrayerModel("عصر","4","4","-","-","-","-"));
     list.add(new PrayerModel("مغرب","-","3","2","2","-","-"));
     list.add(new PrayerModel("عشاء","4","4","2","2","3","2"));
     list.add(new PrayerModel("جمعہ","4","2","4+2","2","-","-"));

     adapter=new PrayerAdapter(getContext(),list);
     recyclerView.setAdapter(adapter);
     recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}