package com.example.practicalday_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
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
            case R.id.one:
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.two:
                Intent intent3 = new Intent(Home.this, Form.class);
                startActivity(intent3);
                return true;
            case R.id.three:
                Intent intent2 = new Intent(Home.this, Calculator.class);
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}