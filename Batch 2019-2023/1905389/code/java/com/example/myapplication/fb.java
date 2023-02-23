package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fb extends AppCompatActivity {
    Button openApp;
    Button openWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb);
        openApp = findViewById(R.id.fbapp);
        openWeb = findViewById(R.id.fbweb);

        openApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.android");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(fb.this, "You don't have facebook installed", Toast.LENGTH_LONG).show();
                }
            }
        });
        openWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.facebook.com/login");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webIntent != null) {
                    startActivity(webIntent);
                } else {
                    Toast.makeText(fb.this, "You don't have facebook installed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}