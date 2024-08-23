package com.example.practicalday_2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.Calendar;

public class Form extends AppCompatActivity {

    MaterialAutoCompleteTextView tv;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        getSupportActionBar().setTitle("Form");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.homepage);


        tv=findViewById(R.id.date);

        Calendar myCalendar = Calendar.getInstance();
        Integer month=myCalendar.get(Calendar.MONTH);
        Integer dayOfMonth=myCalendar.get(Calendar.DAY_OF_MONTH);
        Integer year=myCalendar.get(Calendar.YEAR);


        tv.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    datePickerDialog=new DatePickerDialog(Form.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            month += 1;
                            myCalendar.set(Calendar.YEAR, year);
                            myCalendar.set(Calendar.MONTH, month);
                            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                            tv.setText(dayOfMonth+"/"+month+"/"+year);
                        }
                    },  year, month, dayOfMonth
                            );
                    datePickerDialog.show();

                }
            }
        });


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
                Intent intent = new Intent(Form.this, MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.three:
                Intent intent2 = new Intent(Form.this, Calculator.class);
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent2 = new Intent(Form.this, Home.class);
        startActivity(intent2);
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent2 = new Intent(Form.this, Home.class);
        startActivity(intent2);    }
}