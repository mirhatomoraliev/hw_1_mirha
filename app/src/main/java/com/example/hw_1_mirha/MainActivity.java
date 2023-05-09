package com.example.hw_1_mirha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText etFirst;
    private EditText etSecond;
    private EditText etThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        onClick();
    }

    private void initViews() {
        btn=findViewById(R.id.btn);
        etFirst=findViewById(R.id.et_first);
        etSecond=findViewById(R.id.et_second);
        etThird=findViewById(R.id.et_third);
    }


    private void onClick() {
        btn.setOnClickListener(view -> {
            if (!etFirst.getText().toString().isEmpty() &&
                    !etSecond.getText().toString().isEmpty() &&
                    !etThird.getText().toString().isEmpty()){
                navigateToSecond();
            }
            else {
                System.out.println("ERROR");
            }
        });
    }


    private void navigateToSecond() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("first", etFirst.getText().toString());
        intent.putExtra("second", etSecond.getText().toString());
        intent.putExtra("third", etThird.getText().toString());
        startActivity(intent);
    }
}