package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    Button signup;
    EditText em;
    EditText cf;
    EditText ps;
    EditText nm;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        signup = findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                em = findViewById(R.id.editTextTextEmailAddress);
                cf = findViewById(R.id.editTextTextEmailAddress1);
                ps = findViewById(R.id.editTextTextPassword);
                nm = findViewById(R.id.editTextTextPersonName2);
                if(em.getText().toString().length() !=0 && cf.getText().toString().length() !=0 && ps.getText().toString().length() !=0 && nm.getText().toString().length() !=0) {


                    Intent signupintent = getPackageManager().getLaunchIntentForPackage("com.spotify.music");
                    if (signupintent != null) {
                        startActivity(signupintent);
                    } else {
                        Toast.makeText(MainActivity.this, "You don't have Spotify installed", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "All fields required", Toast.LENGTH_LONG).show();

                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,fb.class);
                startActivity(i);

            }
        });
    }
//    public void show(View v){
//
//    }
}