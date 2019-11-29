package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class validasireservasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasireservasi);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void validasi(View view) {
        Intent intent = new Intent(validasireservasi.this, valid1.class);
        startActivity(intent);
    }
}
