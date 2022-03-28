package com.mehboob.ramzankareem.fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mehboob.ramzankareem.R;


public class Tasbih extends Fragment {
AppCompatButton btnReset;
ImageButton addButton;
TextView tvTasbih;
   int count=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tasbih, container, false);

         btnReset=view.findViewById(R.id.btnTasbihReset);
         addButton =view.findViewById(R.id.btnTasbihPlus);
         tvTasbih=view.findViewById(R.id.tasbihCount);

         addButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 tvTasbih.setText(""+count);
                 count++;

             }
         });
         btnReset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 count=0;
                 tvTasbih.setText(""+0);
             }
         });

        return view;
    }
}