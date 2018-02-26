package com.example.mars.marzullitris;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AvversarioPersona extends AppCompatActivity {
    Button b;
    EditText g1;
    EditText g2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avversario);
        b=findViewById(R.id.button4);
        g1=findViewById(R.id.editText);
        g2=findViewById(R.id.editText2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!g1.getText().equals("") && !g2.getText().equals("")){
                    Intent i = new Intent(AvversarioPersona.this, Partita.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Compilare tutti i campi!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
