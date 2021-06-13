package com.example.mobile_harpuneet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class Frame extends AppCompatActivity {
    FrameLayout fl1,fl2,fl3;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        getSupportActionBar().setTitle("Frame Layout");

        fl1 = findViewById(R.id.layoutOne);
        fl2 = findViewById(R.id.layoutTwo);
        fl3 = findViewById(R.id.layoutThree);

        btn1 = findViewById(R.id.FL_btn1);
        btn2 = findViewById(R.id.FL_btn2);
        btn3 = findViewById(R.id.FL_btn3);

        fl2.setVisibility(View.GONE);
        fl3.setVisibility(View.GONE);

        btn1.setOnClickListener(v -> {
            fl2.setVisibility(View.VISIBLE);
            fl1.setVisibility(View.GONE);
        });

        btn2.setOnClickListener(v -> {
            fl3.setVisibility(View.VISIBLE);
            fl2.setVisibility(View.GONE);
        });

        btn3.setOnClickListener(v -> {
            fl1.setVisibility(View.VISIBLE);
            fl3.setVisibility(View.GONE);
        });
    }
}