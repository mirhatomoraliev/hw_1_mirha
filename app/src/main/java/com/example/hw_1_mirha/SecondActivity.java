package com.example.hw_1_mirha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvFirst;
    TextView tvSecond;
    TextView tvThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        setResult();
    }

    private void setResult() {
        tvFirst.setText(getIntent().getStringExtra("first"));
        tvSecond.setText(getIntent().getStringExtra("second"));
        tvThird.setText(getIntent().getStringExtra("third"));
    }

    private void initViews() {
        tvFirst=findViewById(R.id.tv_first);
        tvSecond=findViewById(R.id.tv_second);
        tvThird=findViewById(R.id.tv_third);
    }
}