package com.example.uygulama2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 vp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp2=findViewById(R.id.viewpager);

        Hesap hesap1=new Hesap("Türk Lirası","Timur İnan",10000);
        Hesap hesap2=new Hesap("Euro","Ahmet İnan",500);
        Hesap hesap3=new Hesap("Dolar","Timur Yalnız",100);
        Hesap hesap4=new Hesap("Altın (gr)","Bahadır Kaya",600);
        Hesap hesap5=new Hesap("Fon (Tl)","Sevinç Gül",5000);

        Fragment_Hesap fh1=new Fragment_Hesap();
        Fragment_Hesap fh2=new Fragment_Hesap();
        Fragment_Hesap fh3=new Fragment_Hesap();
        Fragment_Hesap fh4=new Fragment_Hesap();
        Fragment_Hesap fh5=new Fragment_Hesap();

        fh1.setHesap(hesap1);
        fh2.setHesap(hesap2);
        fh3.setHesap(hesap3);
        fh4.setHesap(hesap4);
        fh5.setHesap(hesap5);

        Fragment_Adapter fa=new Fragment_Adapter(getSupportFragmentManager(), getLifecycle());
        fa.fragmentler.add(fh1);
        fa.fragmentler.add(fh2);
        fa.fragmentler.add(fh3);
        fa.fragmentler.add(fh4);
        fa.fragmentler.add(fh5);

        vp2.setAdapter(fa);

    }
}