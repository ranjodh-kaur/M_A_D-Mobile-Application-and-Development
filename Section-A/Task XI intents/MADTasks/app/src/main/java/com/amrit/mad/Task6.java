package com.amrit.mad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.Calendar;
import java.util.Locale;

public class Task6 extends AppCompatActivity {
    MaterialAutoCompleteTextView txtDate,select_access_type;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initViews();
        select_access_type.setAdapter(new ArrayAdapter<>(Task6.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.access_type)));
        txtDate.setOnFocusChangeListener((v, hasFocus) -> {
            if(hasFocus){
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(Task6.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txtDate.setText(String.format(Locale.ENGLISH,"%02d-%02d-%02d",dayOfMonth,month,year));
                    }
                },year,month,day);
                datePickerDialog.show();
                txtDate.clearFocus();
            }
        });

    }

    private void initViews() {
        select_access_type = findViewById(R.id.select_access_type);
        txtDate = findViewById(R.id.txt_Date);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.item_form).setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_linkages,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item_home:
                Intent intent = new Intent(getApplicationContext(),Task9.class);
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