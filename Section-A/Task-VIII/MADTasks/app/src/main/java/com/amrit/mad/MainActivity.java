package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    MaterialAutoCompleteTextView txtDate,select_access_type;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        select_access_type.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.access_type)));
        txtDate.setOnFocusChangeListener((v, hasFocus) -> {
            if(hasFocus){
                final Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
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
}