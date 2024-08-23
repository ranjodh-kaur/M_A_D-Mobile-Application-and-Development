package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
//    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld);


        button = findViewById(R.id.button);


//        button1 = findViewById(R.id.btn);


        button2 = findViewById(R.id.btn1);

        button3 = findViewById(R.id.btn3);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Calculator",Toast.LENGTH_LONG).show();
            }
        });

//        button1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent intent= new Intent(MainActivity.this,MainActivity3.class);
//                startActivity(intent);
//                Toast.makeText(getBaseContext(),"Sign Up Form",Toast.LENGTH_LONG).show();
//            }
//        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Multi-Threading Example",Toast.LENGTH_LONG).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"Permission Example",Toast.LENGTH_LONG).show();
            }
        });
    }
}