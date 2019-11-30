package com.spm.sejarahting4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login_teacher extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    private EditText mEmail, mPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_teacher);


        mEmail = findViewById(R.id.teachEmail);
        mPassword = findViewById(R.id.login_password_input);
        btnLogin = findViewById(R.id.login_btn);

        btnLogin.setOnClickListener(this);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

    }

        @Override
        public void onClick(View view) {
            if (view == btnLogin)
            {
                login();
            }
        }

        private void login() {
            String email = mEmail.getText().toString().trim();
            String password = mPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                return;
            }
            else
            {
                if (!email.equalsIgnoreCase("deanna@gmail.com") )
                {
                    Toast.makeText(this, "You are Not a Teacher", Toast.LENGTH_SHORT).show();
                    return;
                }
                /*else if (!email.equalsIgnoreCase("aisyah@gmail.com"))
                {
                    Toast.makeText(this, "You are Not a Teacher", Toast.LENGTH_SHORT).show();
                    return;
                }*/
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                return;
            }

            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(login_teacher.this, "Login Succesfully !!!", Toast.LENGTH_SHORT).show();
                        finish();
                        startActivity(new Intent(login_teacher.this, menupageTeacher.class));
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(login_teacher.this, "Unsuccesfully Login !!!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        @Override
        protected void onStart()
        {
            super.onStart();
            if (mAuth.getCurrentUser() != null)
            {
                if (mAuth.getCurrentUser().getEmail().equalsIgnoreCase("deanna@gmail.com"))
                {
                    finish();
                    startActivity(new Intent(login_teacher.this, menupageTeacher.class));
                }
            }
        }

    }
