package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profilcafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilcafe);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void edit(View view) {
        Intent intent = new Intent(profilcafe.this, editcafe.class);
        startActivity(intent);
    }
}
