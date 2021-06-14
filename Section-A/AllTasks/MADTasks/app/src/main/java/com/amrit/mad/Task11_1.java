package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class Task11_1 extends AppCompatActivity {

    MaterialButton btnSend;
    TextInputEditText etxt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task11_1);
        etxt1 = findViewById(R.id.etxt11_1a);
        btnSend = findViewById(R.id.btn11_Send);

        btnSend.setOnClickListener(v->{
            String input= etxt1.getText().toString().trim();
            if(input.isEmpty()){
                etxt1.setError("Invalid Input");
                return;
            }
            Intent intent = new Intent(Task11_1.this,Task11_2.class);
            Bundle bundle = new Bundle();
            bundle.putString("myInput",input);
            intent.putExtra("myBundle",bundle);
            startActivity(intent);
        });
    }
}