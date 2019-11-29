package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class regis2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis2);
    }

    public void daftar2(View view) {
        Intent intent = new Intent(regis2.this, home.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(regis2.this, login2.class);
        startActivity(intent);
    }
}
