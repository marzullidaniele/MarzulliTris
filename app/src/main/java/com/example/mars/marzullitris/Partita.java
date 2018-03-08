package com.example.mars.marzullitris;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Partita  extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.partita);
        Bundle nomi = getIntent().getExtras();
        String n1=nomi.getString("n1");
        String n2 =nomi.getString("n2");
        tv1=findViewById(R.id.textView5);
        tv1.setText(n1 + "->");
        tv2=findViewById(R.id.textView6);
        tv2.setText(n2 + "->");
        tv3=findViewById(R.id.textView10);
        tv3.setText(n1);
        b1=findViewById(R.id.imageButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setBackground(getDrawable(R.drawable.x));
            }
        });
    }
}
