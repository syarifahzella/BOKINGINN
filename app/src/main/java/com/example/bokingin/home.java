package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void profil(View view) {
        Intent intent = new Intent(home.this, profilcafe.class);
        startActivity(intent);
    }

    public void validasi(View view) {
        Intent intent = new Intent(home.this, validasireservasi.class);
        startActivity(intent);
    }

    public void onBackPressed(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(home.this);
        builder.setMessage("Anda yakin ingin keluar?");
        builder.setCancelable(true);
        builder.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        Button pbutton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
        //Set positive button background
        pbutton.setBackgroundColor(Color.BLACK);

        Button nbutton = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE);
        //Set positive button background
        nbutton.setBackgroundColor(Color.BLACK);
    }

}
