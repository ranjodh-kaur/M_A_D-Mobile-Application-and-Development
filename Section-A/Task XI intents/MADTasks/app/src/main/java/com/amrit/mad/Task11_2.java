package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Task11_2 extends AppCompatActivity {

    TextView txtReceived;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task11_2);
        txtReceived = findViewById(R.id.txt11_2b);
        Bundle rcv = getIntent().getBundleExtra("myBundle");
        String received = rcv.getString("myInput");
        txtReceived.setText(received);
    }
}