package com.example.bokingin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reservasi3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservasi3);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void onBackPressed(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(reservasi3.this);
        builder.setMessage("Anda sukses mereservasi!");
        builder.setCancelable(true);
        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
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
