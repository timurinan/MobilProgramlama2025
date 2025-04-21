package com.example.uygulama1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Müşteri> müşteriler=new ArrayList<Müşteri>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        müşteriler.add(new Müşteri("Timur İnan","1111111","timurinan@hotmail.com"));
        müşteriler.add(new Müşteri("Mehmet Kaya","22222222","mkaya@hotmail.com"));
        müşteriler.add(new Müşteri("Zehra Saygın","33333333","sayginzehra@hotmail.com"));
        müşteriler.add(new Müşteri("Seda Tüfekçi","45421545215","sedatufekci@hotmail.com"));
        müşteriler.add(new Müşteri("Elif Yıldırım","56477875457","yildirim_elif@hotmail.com"));

        BenimAdapter benimAdapter=new BenimAdapter(müşteriler,getApplicationContext());

        recyclerView.setAdapter(benimAdapter);

        LinearLayoutManager manager=new LinearLayoutManager(getApplicationContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);

    }
}