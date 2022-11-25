package com.example.month3_lesson4_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setContentView(R.layout.activity_main2);
        TextView show = findViewById(R.id.show);
        String result = getIntent().getStringExtra("Result");
        show.setText(result);
    }
}