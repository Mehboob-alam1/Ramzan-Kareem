package com.mehboob.ramzankareem.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mehboob.ramzankareem.R;
import com.mehboob.ramzankareem.models.PrayerModel;

import java.util.ArrayList;

public class PrayerAdapter extends RecyclerView.Adapter<PrayerAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<PrayerModel> list;

    public PrayerAdapter(Context context, ArrayList<PrayerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_prayers, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PrayerModel data = list.get(position);
           holder.prayer.setText(data.getPrayer());
           holder.sunat1.setText(data.getSunat1());
           holder.farz.setText(data.getFarz());
           holder.sunat2.setText(data.getSunat2());
           holder.nafal1.setText(data.getNafal1());
           holder.viter.setText(data.getViter());
           holder.nafal2.setText(data.getNafal2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView prayer, sunat1, farz, sunat2, nafal1, viter, nafal2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            prayer = itemView.findViewById(R.id.prayer_txt);
            sunat1 = itemView.findViewById(R.id.sunat1);
            farz = itemView.findViewById(R.id.farz);
            sunat2 = itemView.findViewById(R.id.sunat2);
            nafal1 = itemView.findViewById(R.id.nafal1);
            viter = itemView.findViewById(R.id.viter);
            nafal2 = itemView.findViewById(R.id.nafal2);
        }
    }
}
