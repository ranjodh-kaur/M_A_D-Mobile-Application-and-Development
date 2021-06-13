package com.example.mobile_harpuneet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.mobile_harpuneet.Fragments.FirstFragment;
import com.example.mobile_harpuneet.Fragments.SecondFragment;


public class FragmentTask extends AppCompatActivity {

    Button btn1 , btn2;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_task);

        getSupportActionBar().setTitle("Fragment Task");

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        linearLayout = findViewById(R.id.linearLayout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,firstFragment);
                transaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,secondFragment);
                transaction.commit();
            }
        });



    }
}