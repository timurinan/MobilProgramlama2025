package com.example.uygulama2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Hesap extends Fragment {

    TextView txt_hesapsahibi, txt_hesaptürü,txt_bakiye;
    Hesap hesap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_fragment,container,false);
        txt_hesapsahibi=view.findViewById(R.id.txt_hesapsahibi);
        txt_hesaptürü=view.findViewById(R.id.txt_hesaptürü);
        txt_bakiye=view.findViewById(R.id.txt_bakiye);

        txt_hesapsahibi.setText(hesap.getHesapsahibi());
        txt_hesaptürü.setText(hesap.getHesaptürü());
        txt_bakiye.setText(hesap.getBakiye()+"");
        return view;
    }

    public void setHesap(Hesap gelenhesap){
        hesap=gelenhesap;
    }
}
