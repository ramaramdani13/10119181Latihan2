package com.example.a10119181latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Pindah(View view) {
        Intent intent = new Intent(RegisterActivity.this, AlmostActivity.class);
        startActivity(intent);
    }
}