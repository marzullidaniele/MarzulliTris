package com.example.mars.marzullitris;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(2)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(3)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(4)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent fine = getIntent();
                                                startActivity(fine);
                                            }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b1.setBackground(getDrawable(R.drawable.cerchio));
                    b1.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(1);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(2)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(3)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(4)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(3)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(8)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b2.setBackground(getDrawable(R.drawable.cerchio));
                    b2.setClickable(false);
                    tv3.setText(n2);
                    giocate2.add(2);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(3)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(8)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(2)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(6)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b3.setBackground(getDrawable(R.drawable.cerchio));
                    b3.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(3);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(2)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(6)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(6)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b4.setBackground(getDrawable(R.drawable.cerchio));
                    b4.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(4);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(5)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(6)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(2)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(8)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(4)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(6)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b5.setBackground(getDrawable(R.drawable.cerchio));
                    b5.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(5);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(2)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(8)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(4)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(6)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(7)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(4)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b6.setBackground(getDrawable(R.drawable.cerchio));
                    b6.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(6);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(4)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(4)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(8)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b7.setBackground(getDrawable(R.drawable.cerchio));
                    b7.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(7);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(4)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(8)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(2)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(7)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b8.setBackground(getDrawable(R.drawable.cerchio));
                    b8.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(8);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(2)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(7)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(9)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
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
                    Collections.sort(giocate1);
                    int y=0;
                    while (y<giocate1.size()){
                        if(giocate1.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(6)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate1.get(y).equals(7)){
                            int k=y+1;
                            while (k<giocate1.size()){
                                if(giocate1.get(k).equals(8)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n1 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    if(giocate1.size()>4){
                        AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                        builder.setTitle("Partita terminata");

                        builder.setMessage("Pareggio!")
                                .setCancelable(false)
                                .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    conta++;
                } else {
                    b9.setBackground(getDrawable(R.drawable.cerchio));
                    b9.setClickable(false);
                    tv3.setText(n1);
                    giocate2.add(9);
                    Collections.sort(giocate2);
                    int y=0;
                    while (y<giocate2.size()){
                        if(giocate2.get(y).equals(1)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(5)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(3)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(6)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        if(giocate2.get(y).equals(7)){
                            int k=y+1;
                            while (k<giocate2.size()){
                                if(giocate2.get(k).equals(8)){
                                    AlertDialog.Builder builder = new AlertDialog.Builder(Partita.this);
                                    builder.setTitle("Partita terminata");

                                    builder.setMessage(n2 + " hai vinto!")
                                            .setCancelable(false)
                                            .setPositiveButton("Torna al menù iniziale", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // TODO: handle the OK
                                        Intent fine = new Intent(Partita.this, MainActivity.class);
                                        startActivity(fine);
                                    }
                                })
                                .setNegativeButton("Ricomincia partita", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent fine = getIntent();
                                        startActivity(fine);
                                    }
                                });
                                    AlertDialog alertDialog = builder.create();
                                    alertDialog.show();
                                }
                                k++;
                            }
                        }
                        y++;
                    }
                    conta++;
                }
            }
        });
    }
}
