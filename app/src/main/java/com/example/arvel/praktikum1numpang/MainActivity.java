package com.example.arvel.praktikum1numpang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mm,pm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mm = (EditText)findViewById(R.id.menumakanan);
        pm = (EditText)findViewById(R.id.porsimakanan);
    }

    public void onClickEatbus(View view){
        mm = (EditText)findViewById(R.id.menumakanan);
        pm = (EditText)findViewById(R.id.porsimakanan);
        String p =  String.valueOf(pm.getText());
        if (mm.getText().toString().equalsIgnoreCase("Nasi Uduk")&&p.equalsIgnoreCase("2")){
            Intent i = new Intent(this, SecondActivity.class);
            String id = "1";
            i.putExtra("idButton", id);
            startActivity(i);
        }else {
            Toast.makeText(getApplicationContext(), "Makanan Harus diisi dengan 'Nasi Uduk' dan porsi harus '2'", Toast.LENGTH_LONG).show();
        }
    }
    public void onClickAbnormal (View view){
        mm = (EditText) findViewById(R.id.menumakanan);
        pm = (EditText) findViewById(R.id.porsimakanan);
        String p = String.valueOf(pm.getText());
        if(mm.getText().toString().equalsIgnoreCase("Nasi Uduk")&&p.equalsIgnoreCase("2")) {
            Intent i = new Intent(this, SecondActivity.class);
            String id = "2";
            i.putExtra("idButton", id);
            startActivity(i);
    }else {
            Toast.makeText(getApplicationContext(),"Makanan Harus diisi dengan 'Nasi Uduk' dan porsi harus '2'",Toast.LENGTH_LONG).show();
        }
    }
}