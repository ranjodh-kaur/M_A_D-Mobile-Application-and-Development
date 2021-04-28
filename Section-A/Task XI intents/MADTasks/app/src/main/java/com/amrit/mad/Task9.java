package com.amrit.mad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Task9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task9);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_linkages,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.item_home).setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item_form:
                Intent intent = new Intent(getApplicationContext(),Task6.class);
                startActivity(intent);
                break;
            case R.id.item_calculator:
                Intent intent1 = new Intent(getApplicationContext(),Task8.class);
                startActivity(intent1);
                break;
            case R.id.item_ui:
                Intent intent2 = new Intent(getApplicationContext(),Task5.class);
                startActivity(intent2);
                break;
            case R.id.item_signout:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}