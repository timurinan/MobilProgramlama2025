package com.example.uygulama1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button btn_fragment1,btn_fragment2;
    FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fragment1=findViewById(R.id.btn_fragment1);
        btn_fragment2=findViewById(R.id.btn_fragment2);

        fl=findViewById(R.id.frame_layout);

        btn_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout,new Fragment1())
                        .commit();
            }
        });

        btn_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout,new Fragment2())
                        .commit();
            }
        });
    }
}