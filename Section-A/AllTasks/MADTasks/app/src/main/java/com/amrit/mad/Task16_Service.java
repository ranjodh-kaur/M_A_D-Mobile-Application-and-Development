package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amrit.mad.services.MyService;

public class Task16_Service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task16__service);
    }

    public void startMyService(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void stopMyService(View view) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}