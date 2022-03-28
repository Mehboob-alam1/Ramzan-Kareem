package com.mehboob.ramzankareem.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.mehboob.ramzankareem.R;


public class AsmaUlHassana extends Fragment implements View.OnClickListener {
    MediaPlayer music;
   ImageView btnStart,btnStop;
    boolean isPlaing = true;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_asma_ul_hassana, container, false);
        music = MediaPlayer.create(getContext(), R.raw.asma);


     btnStart=view.findViewById(R.id.start);
     btnStop=view.findViewById(R.id.stop);

btnStop.setOnClickListener(this);
btnStart.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start:
                if(isPlaing) {
                    music.start();
                    btnStart.setImageResource(R.drawable.ic_baseline_pause_24);
                    isPlaing = false;
                }else {
                    music.pause();
                    btnStart.setImageResource(R.drawable.ic_baseline_play_arrow_24);
                    isPlaing = true;
                }

                break;

            case R.id.stop:
                music.stop();
                music=MediaPlayer.create(getContext(),R.raw.asma);
                isPlaing=true;


        }
    }
}