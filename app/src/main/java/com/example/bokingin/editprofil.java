package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class editprofil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofil);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void simpan(View view) {
        Intent intent = new Intent(editprofil.this, akunprofil.class);
        startActivity(intent);
    }
}
