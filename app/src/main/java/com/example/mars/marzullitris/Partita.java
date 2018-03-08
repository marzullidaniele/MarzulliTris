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
    Button b2;
    int conta=0;
    String n1;
    String n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.partita);
        Bundle nomi = getIntent().getExtras();
        n1=nomi.getString("n1");
        n2 =nomi.getString("n2");
        tv1=findViewById(R.id.textView5);
        tv1.setText(n1 + "->");
        tv2=findViewById(R.id.textView6);
        tv2.setText(n2 + "->");
        tv3=findViewById(R.id.textView10);
        tv3.setText(n1);
        b1=findViewById(R.id.imageButton);
        b2=findViewById(R.id.imageButton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b1.setBackground(getDrawable(R.drawable.x));
                    b1.setClickable(false);
                    conta++;
                } else {
                    b1.setBackground(getDrawable(R.drawable.cerchio));
                    b1.setClickable(false);
                    conta++;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b2.setBackground(getDrawable(R.drawable.x));
                    b2.setClickable(false);
                    tv3.setText(n2);
                    conta++;
                } else {
                    b2.setBackground(getDrawable(R.drawable.cerchio));
                    b2.setClickable(false);
                    tv3.setText(n1);
                    conta++;
                }
            }
        });
    }
}
