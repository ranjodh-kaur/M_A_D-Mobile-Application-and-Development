package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPassword;
    Button Inbtn, delbtn, upbtn, vwbtn;
    database g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPassword=findViewById(R.id.editTextTextPassword);
        Inbtn=findViewById(R.id.Inbtn);
        delbtn=findViewById(R.id.delbtn);
        upbtn=findViewById(R.id.upbtn);
        vwbtn=findViewById(R.id.vwbtn);

        g = new database(this);
//        g.getReadableDatabase();

        Inbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email1 = editTextTextPersonName.getText().toString();
                String name1 = editTextTextPersonName2.getText().toString();
                String Password1 = editTextTextPassword.getText().toString();

                if(name1.equals("") || Email1.equals("") || Password1.equals(""))
                {
                    Toast.makeText(MainActivity3.this,"Enter all the fields",Toast.LENGTH_SHORT).show();
                }
                else{
                            Boolean i=g.insert_data(name1,Email1,Password1);
                            if(i==true){
                                Toast.makeText(MainActivity3.this,"Data Added Successfully",Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(MainActivity3.this,"Not successful",Toast.LENGTH_SHORT).show();
                            }
                }

            }
        });
    }
}