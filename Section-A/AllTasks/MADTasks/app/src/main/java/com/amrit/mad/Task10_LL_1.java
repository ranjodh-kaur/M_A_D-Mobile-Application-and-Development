package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class Task10_LL_1 extends AppCompatActivity {

    MaterialButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task10_l_l_1);
        btn1 = findViewById(R.id.LL_btn1);
        btn2 = findViewById(R.id.LL_btn2);
        btn3 = findViewById(R.id.LL_btn3);
        btn4 = findViewById(R.id.LL_btn4);

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#29CF74"));

        // Set BackgroundDrawable
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(Task10_LL_1.this,Task10_LL_2.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(Task10_LL_1.this,Task10_CL.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(Task10_LL_1.this,Task10_FL.class);
            startActivity(intent);
        });
        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(Task10_LL_1.this,Task10_RL.class);
            startActivity(intent);
        });
    }
}