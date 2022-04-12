package com.mehboob.ramzankareem.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.mehboob.ramzankareem.R;


public class Tasbih extends Fragment {
    AppCompatButton btnReset;
    ImageButton addButton;
    LinearLayout layout;
    TextView tvTasbih;
    private AdView adView;
    AdRequest adRequest;
    int count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tasbih, container, false);
        adView = (AdView) view.findViewById(R.id.ad_view_tasbih);
        MobileAds.initialize(requireContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        btnReset = view.findViewById(R.id.btnTasbihReset);
        addButton = view.findViewById(R.id.btnTasbihPlus);
        layout = view.findViewById(R.id.counter_layout);
        tvTasbih = view.findViewById(R.id.tasbihCount);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTasbih.setText("" + count);
                count++;

            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTasbih.setText("" + count);
                count++;

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvTasbih.setText("" + 0);
            }
        });

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