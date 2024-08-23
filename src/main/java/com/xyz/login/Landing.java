package com.xyz.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Landing extends AppCompatActivity {
    EditText numb1, numb2;
    Button add, sub, mul, div;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        numb1 = findViewById(R.id.numb1);
        numb2 = findViewById(R.id.numb2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        ans = findViewById(R.id.ans);

        add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numb1.getText().toString().matches(""))
                    numb1.setError("please enter a number");

                int a, b, c;
                a = Integer.parseInt(numb1.getText().toString());
                b = Integer.parseInt(numb2.getText().toString());
                c = a + b;
                ans.setText("Result: " +c);
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numb1.getText().toString().matches(""))
                    numb1.setError("please enter a number");

                int a, b, c;
                a = Integer.parseInt(numb1.getText().toString());
                b = Integer.parseInt(numb2.getText().toString());
                c = a - b;
                ans.setText("Result: " +c);


            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numb1.getText().toString().matches(""))
                    numb1.setError("please enter a number");

                int a, b, c;
                a = Integer.parseInt(numb1.getText().toString());
                b = Integer.parseInt(numb2.getText().toString());
                c = a * b;
                ans.setText("Result: " +c);
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numb1.getText().toString().matches(""))
                    numb1.setError("please enter a number");

                int a, b, c;
                a = Integer.parseInt(numb1.getText().toString());
                b = Integer.parseInt(numb2.getText().toString());
                c = a / b;
                ans.setText("Result: " +c);

            }

        });
    }
}