package com.example.arvel.praktikum1numpang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView namaTempat, harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        namaTempat = (TextView) findViewById(R.id.namatempat);
        harga = (TextView) findViewById(R.id.harga);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        String data = (String)bd.get("idButton");
        if (data.equalsIgnoreCase("l")){
            namaTempat.setText("Eatbus");
            harga.setText("100000");
            Toast.makeText(getApplicationContext(),"jangan disini makan malamnya uang kamu tidak cukup",Toast.LENGTH_LONG).show();
        }else if (data.equalsIgnoreCase("2")){
            namaTempat.setText("Abnormal");
            harga.setText("60000");
            Toast.makeText(getApplicationContext(),"Disini aja makan malamnya", Toast.LENGTH_LONG).show();
        }
    }
}
