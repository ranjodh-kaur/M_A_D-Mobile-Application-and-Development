package com.xyz.login;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    TextView fn1,ln1,psw1,us1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);
        database b =  new database(this);
        SQLiteDatabase db = b.getReadableDatabase();
        fn1=findViewById(R.id.fn1);
        ln1=findViewById(R.id.ln1);
        psw1=findViewById(R.id.psw1);
        us1=findViewById(R.id.us1);
        b1=findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname=fn1.getText().toString();
                String lname=ln1.getText().toString();
                String user=us1.getText().toString();
                String pass=psw1.getText().toString();
                if(fname.equals("") || lname.equals("") || user.equals("") || pass.equals(""))
                {
                    Toast.makeText(SignUp.this, "Enter all the fields ", Toast.LENGTH_SHORT).show();
                }
              else {
                    Boolean i = b.insert_data(fname, lname, user, pass);
                    if(i==true)
                    {
                        Toast.makeText(SignUp.this, "Successful Registration", Toast.LENGTH_SHORT).show();
                        Intent f = new Intent(SignUp.this,MainActivity.class);
                        startActivity(f);

                    }

              else
                    {
                        Toast.makeText(SignUp.this, "Not Successful", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }

}