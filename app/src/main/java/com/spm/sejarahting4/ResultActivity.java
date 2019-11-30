package com.spm.sejarahting4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView t1,betul,salah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        t1= (TextView) findViewById(R.id.textView3);
        betul= (TextView) findViewById(R.id.betul);
        salah= (TextView) findViewById(R.id.salah);

        Intent i = getIntent();

        String questions = i.getStringExtra("total");
        String correct = i.getStringExtra("correct");
        String wrong = i.getStringExtra("incorrect");

        t1.setText(questions);
        betul.setText(correct);
        salah.setText(wrong);

    }
}
