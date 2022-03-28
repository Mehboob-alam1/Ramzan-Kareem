package com.mehboob.ramzankareem.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mehboob.ramzankareem.R;
import com.mehboob.ramzankareem.fragments.Azkar;
import com.mehboob.ramzankareem.models.AzkarModel;

import java.util.ArrayList;

public class AzkarAdapter extends RecyclerView.Adapter<AzkarAdapter.MyViewHolder> {
Context context;
ArrayList<AzkarModel> list;

    public AzkarAdapter(Context context, ArrayList<AzkarModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.supplication_lauout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
  AzkarModel data=   list.get(position);
    holder.duaEnglish.setText(data.getDuaEngTitle());
    holder.duaUrdu.setText(data.getDuaUrduTitle());
    holder.dua.setText(data.getDua());
    holder.duaTranslation.setText(data.getDuaTranslation());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
TextView duaEnglish,duaUrdu,dua,duaTranslation;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            duaEnglish=itemView.findViewById(R.id.engDuaTitle);
            duaUrdu=itemView.findViewById(R.id.urduDuaTitle);
            dua=itemView.findViewById(R.id.dua);
            duaTranslation=itemView.findViewById(R.id.duaTranslation);
        }
    }
}
