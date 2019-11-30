package com.spm.sejarahting4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notabab2kosong1 extends AppCompatActivity {

    private Button a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notabab2kosong1);

        a= findViewById(R.id.prev);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(notabab2kosong1.this,notabab2.class);
                startActivity(i); }
        });
    }
}
