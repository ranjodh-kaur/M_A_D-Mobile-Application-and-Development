package com.example.mobile_harpuneet;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginPage extends AppCompatActivity {

    TextInputEditText lemail, lpassword;
    Button login;
    String rcv1,rcv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        getSupportActionBar().setTitle("Login Page");

        lemail = findViewById(R.id.lemail);
        lpassword = findViewById(R.id.lpassword);
        login = findViewById(R.id.llogin);

        rcv1 = getIntent().getStringExtra("email");
        rcv2 = getIntent().getStringExtra("password");

        lemail.setText(rcv1);
        lpassword.setText(rcv2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(LoginPage.this, "SUCCESS!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginPage.this,FragmentTask.class);
                startActivity(intent);

            }
        });

    }
}

// run
//intent change krte? or same rkhni
//works fine    nyc