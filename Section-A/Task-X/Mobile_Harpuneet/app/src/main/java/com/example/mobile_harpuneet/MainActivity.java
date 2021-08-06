package com.example.mobile_harpuneet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("User Interface");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.homepage);




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.two:
                Intent intent = new Intent(MainActivity.this, Form.class);
                startActivity(intent);
                return true;
            case R.id.three:
                Intent intent2 = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent2 = new Intent(MainActivity.this, Home.class);
        startActivity(intent2);
       return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent2 = new Intent(MainActivity.this, Home.class);
        startActivity(intent2);    }
}