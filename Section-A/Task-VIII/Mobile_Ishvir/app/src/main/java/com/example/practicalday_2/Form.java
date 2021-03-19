package com.example.practicalday_2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
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
}