package com.xyz.login;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText us1, psw1;
    Button b1,b2;
    database.DBHelper xy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us1=findViewById(R.id.us1);
        psw1=findViewById(R.id.psw1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        xy =  new database.DBHelper(this);

        show();

    }
    public void show()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        String a=us1.getText().toString();
        String b = psw1.getText().toString();
        if(a.equals("") && b.equals(""))
        {
            Toast.makeText(getBaseContext(),"Enter UserName and Password",Toast.LENGTH_SHORT).show();

        }

        else
        {
           boolean checkuserpass= xy.check_username_pass(a,b);
            if(checkuserpass=true){
                Toast.makeText(getBaseContext(), "Sign in Successfully", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,Landing.class);
                startActivity(i);

            }
            else

            {

                    Toast.makeText(getBaseContext(), "Wrong ID or Password", Toast.LENGTH_SHORT).show();

            }


        }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity.this,SignUp.class);
            startActivity(i);
            }
        });
    }
}