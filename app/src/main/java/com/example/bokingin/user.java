package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void pengunjung(View view) {
        Intent intent = new Intent(user.this, regis.class);
        startActivity(intent);
    }

    public void Pemilik(View view) {
        Intent intent = new Intent(user.this, regis2.class);
        startActivity(intent);
    }
}
