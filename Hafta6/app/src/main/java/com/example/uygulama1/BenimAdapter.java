package com.example.uygulama1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BenimAdapter extends RecyclerView.Adapter<BenimAdapter.ViewHolder> {

    ArrayList<Müşteri> müşteriler;
    LayoutInflater inflater;

    public BenimAdapter(ArrayList<Müşteri> müşteriler, Context context) {
        this.müşteriler = müşteriler;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.activity_recyclerview_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Müşteri müşteri=müşteriler.get(position);
        holder.setMüşteri(müşteri);
    }

    @Override
    public int getItemCount() {
        return müşteriler.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_adsoyad, txt_mail, txt_telefon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_adsoyad=itemView.findViewById(R.id.txt_adsoyad);
            txt_mail=itemView.findViewById(R.id.txt_mail);
            txt_telefon=itemView.findViewById(R.id.txt_telefon);
        }

        public void setMüşteri(Müşteri müşteri){
            txt_adsoyad.setText(müşteri.getAdsoyad());
            txt_telefon.setText(müşteri.getTelefon());
            txt_mail.setText(müşteri.getMail());
        }
    }


}
