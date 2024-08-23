package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.amrit.mad.db.MySqlLiteHelper;
import com.google.android.material.textfield.TextInputEditText;

public class Task14 extends AppCompatActivity {

    TextInputEditText etxtStudentName,etxtCollege;
    MySqlLiteHelper mSqlLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task14);
        mSqlLiteHelper = new MySqlLiteHelper(this);
        etxtStudentName = findViewById(R.id.etxtStudentName);
        etxtCollege = findViewById(R.id.etxtCollegeName);
    }

    public void doSave(View view) {
        mSqlLiteHelper.insertData(etxtStudentName.getText().toString(),etxtCollege.getText().toString());
    }

    public void doLoad(View view) {
        mSqlLiteHelper.getAll();
    }
}