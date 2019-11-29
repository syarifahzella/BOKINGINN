package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akunprofil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akunprofil);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void edit(View view) {
        Intent intent = new Intent(akunprofil.this, editprofil.class);
        startActivity(intent);
    }

    public void simpan(View view) {

    }

    public void onBackPressed(View view) {

    }
}
