package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class editcafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editcafe);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void simpan(View view) {
        Intent intent = new Intent(editcafe.this, profilcafe.class);
        startActivity(intent);
    }
}
