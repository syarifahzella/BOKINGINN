package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class daftarcafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarcafe);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Pindah(View view) {
            Intent intent = new Intent(daftarcafe.this, reservasi1.class);
            startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(daftarcafe.this, reservasi2.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(daftarcafe.this, reservasi3.class);
        startActivity(intent);
    }
}
