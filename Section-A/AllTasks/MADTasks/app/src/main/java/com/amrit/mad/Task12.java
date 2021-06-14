package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class Task12 extends AppCompatActivity {

    MaterialButton btnFirstFrag,btnSecondFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task12);
        btnFirstFrag = findViewById(R.id.btn_first_frag);
        btnSecondFrag = findViewById(R.id.btn_second_frag);

        btnFirstFrag.setOnClickListener(v -> {
            Navigation.findNavController(this,R.id.frag_container)
                    .navigate(R.id.action_fragment2_to_fragment1);
            Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this,R.color.purple_500)));
            btnFirstFrag.setClickable(false);
            btnSecondFrag.setClickable(true);
        });

        btnSecondFrag.setOnClickListener(v -> {
            Navigation.findNavController(this,R.id.frag_container)
                    .navigate(R.id.action_fragment1_to_fragment2);
            Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this,R.color.pinkred)));
            btnFirstFrag.setClickable(true);
            btnSecondFrag.setClickable(false);
        });

        btnFirstFrag.setClickable(false);
    }
}