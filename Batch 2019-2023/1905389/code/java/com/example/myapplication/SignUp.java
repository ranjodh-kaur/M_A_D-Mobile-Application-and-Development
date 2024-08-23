//package com.example.ui_practice;
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//public class SignUp extends AppCompatActivity {
//    private EditText name, email, password;
//    private Button register;
//    private FirebaseAuth auth;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sign_up);
//        name = findViewById(R.id.name);
//        email = findViewById(R.id.email);
//        password = findViewById(R.id.password);
//        register = findViewById(R.id.register_btn);
//        auth = FirebaseAuth.getInstance();
//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email_txt = email.getText().toString();
//                String password_txt = password.getText().toString();
//                String name_txt = name.getText().toString();
//                if (TextUtils.isEmpty(email_txt) || TextUtils.isEmpty(password_txt) || TextUtils.isEmpty(
//                        name_txt))
//                    Toast.makeText(SignUp.this, "Empty Credentials!", Toast.LENGTH_SHORT).show();
//                else if (password_txt.length() < 6)
//                    Toast.makeText(SignUp.this, "Password Too short!", Toast.LENGTH_SHORT).show();
//                else {
//                    registerUser(email_txt, password_txt);
//                }
//            }
//        });
//    }
//    private void registerUser(String email, String password) {
//        auth.createUserWithEmailAndPassword(email, password).
//                addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
//                    @Override
