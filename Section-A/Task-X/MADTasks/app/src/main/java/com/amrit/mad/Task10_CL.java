package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Task10_CL extends AppCompatActivity {

    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task10_c_l);
        imageView3 = findViewById(R.id.imageView3);
        imageView3.bringToFront();
        imageView3.invalidate();
    }
}