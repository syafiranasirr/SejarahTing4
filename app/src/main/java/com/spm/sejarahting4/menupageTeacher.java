package com.spm.sejarahting4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class menupageTeacher extends AppCompatActivity {

    private LinearLayout a,b;
    private ImageButton logout;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage_teacher);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        logout = findViewById(R.id.buttonLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Toast.makeText(menupageTeacher.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
                finish();
                startActivity(new Intent(menupageTeacher.this, MainActivity.class));
            }
        });


        a= findViewById(R.id.senaraiNama);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menupageTeacher.this,studentList.class);
                startActivity(i); }
        });

        b= findViewById(R.id.notatambahan);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menupageTeacher.this,uploadPdf.class);
                startActivity(i); }
        });
    }
}
