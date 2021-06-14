package com.amrit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Task17_Debugging extends AppCompatActivity {

    private static final String TAG = "Task17_Debugging";
    private EditText eTxt1,eTxt2;
    private TextView txtResult;
    private MaterialButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task17__debugging);
        eTxt1 = findViewById(R.id.eTxtNum1);
        eTxt2 = findViewById(R.id.eTxtNum2);
        txtResult = findViewById(R.id.txtResult);
        btnAdd = findViewById(R.id.btnAddNum);

        btnAdd.setOnClickListener(v -> {
            Log.i(TAG, "onCreate: Executed 1");
            int num1 = Integer.parseInt(eTxt1.getText().toString().trim());
            Log.i(TAG, "onCreate: Executed 2");
            int num2 = Integer.parseInt(eTxt2.getText().toString().trim());
            Log.i(TAG, "onCreate: Executed 3");
            int res = num1+num2;
            Log.i(TAG, "onCreate: Executed 4");
            txtResult.setText(String.valueOf(res));
            Log.i(TAG, "onCreate: Executed 5");
        });
    }
}