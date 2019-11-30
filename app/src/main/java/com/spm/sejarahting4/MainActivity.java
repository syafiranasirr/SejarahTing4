package com.spm.sejarahting4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        a= (Button) findViewById(R.id.lbtnTeacher);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,login_teacher.class);
                startActivity(i); }
        });


        b= (Button) findViewById(R.id.lbtnStudent);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,login_student.class);
                startActivity(i); }
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
                startActivity(new Intent(MainActivity.this, menupageTeacher.class));
            }
            else
            {
                finish();
                startActivity(new Intent(MainActivity.this, menupageStudent.class));
            }
        }
    }
}
