package com.example.mars.marzullitris;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Partita  extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    int conta=0;
    String n1;
    String n2;
    ArrayList giocate1=new ArrayList();
    ArrayList giocate2=new ArrayList();
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
        b3=findViewById(R.id.imageButton2);
        b4=findViewById(R.id.imageButton3);
        b5=findViewById(R.id.imageButton4);
        b6=findViewById(R.id.imageButton5);
        b7=findViewById(R.id.imageButton6);
        b8=findViewById(R.id.imageButton7);
        b9=findViewById(R.id.imageButton8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b1.setBackground(getDrawable(R.drawable.x));
                    b1.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(1);
                    Collections.sort(giocate1);
                    for(int i=0;i<giocate1.size();i++){

                    }
                    conta++;
                } else {
                    b1.setBackground(getDrawable(R.drawable.cerchio));
                    b1.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(1);
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
                    giocate1.add(2);
                    conta++;
                } else {
                    b2.setBackground(getDrawable(R.drawable.cerchio));
                    b2.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(2);
                    conta++;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b3.setBackground(getDrawable(R.drawable.x));
                    b3.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(3);
                    conta++;
                } else {
                    b3.setBackground(getDrawable(R.drawable.cerchio));
                    b3.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(3);
                    conta++;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b4.setBackground(getDrawable(R.drawable.x));
                    b4.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(4);
                    conta++;
                } else {
                    b4.setBackground(getDrawable(R.drawable.cerchio));
                    b4.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(4);
                    conta++;
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b5.setBackground(getDrawable(R.drawable.x));
                    b5.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(5);
                    conta++;
                } else {
                    b5.setBackground(getDrawable(R.drawable.cerchio));
                    b5.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(5);
                    conta++;
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b6.setBackground(getDrawable(R.drawable.x));
                    b6.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(6);
                    conta++;
                } else {
                    b6.setBackground(getDrawable(R.drawable.cerchio));
                    b6.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(6);
                    conta++;
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b7.setBackground(getDrawable(R.drawable.x));
                    b7.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(7);
                    conta++;
                } else {
                    b7.setBackground(getDrawable(R.drawable.cerchio));
                    b7.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(7);
                    conta++;
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b8.setBackground(getDrawable(R.drawable.x));
                    b8.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(8);
                    conta++;
                } else {
                    b8.setBackground(getDrawable(R.drawable.cerchio));
                    b8.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(8);
                    conta++;
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (conta % 2 == 0) {
                    b9.setBackground(getDrawable(R.drawable.x));
                    b9.setClickable(false);
                    tv3.setText(n2);
                    giocate1.add(9);
                    conta++;
                } else {
                    b9.setBackground(getDrawable(R.drawable.cerchio));
                    b9.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(9);
                    conta++;
                }
            }
        });
    }
}
