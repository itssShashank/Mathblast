package com.example.sam19.mathblast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class table extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    int tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        b1=(Button)findViewById(R.id.but1);
        b2=(Button)findViewById(R.id.but2);

        b3=(Button)findViewById(R.id.but3);
        b4=(Button)findViewById(R.id.but4);
        b5=(Button)findViewById(R.id.but5);
        b6=(Button)findViewById(R.id.but6);
        b7=(Button)findViewById(R.id.but7);
        b8=(Button)findViewById(R.id.but8);
        b9=(Button)findViewById(R.id.but9);
        b10=(Button)findViewById(R.id.but10);
        b11=(Button)findViewById(R.id.but11);
        b12=(Button)findViewById(R.id.but12);

        b13=(Button)findViewById(R.id.but13);
        b14=(Button)findViewById(R.id.but14);
        b15=(Button)findViewById(R.id.but15);
        b16=(Button)findViewById(R.id.but16);
        b17=(Button)findViewById(R.id.but17);
        b18=(Button)findViewById(R.id.but18);
        b19=(Button)findViewById(R.id.but19);
        b20=(Button)findViewById(R.id.but20);


        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text22);
        t3=(TextView)findViewById(R.id.text3);
        t4=(TextView)findViewById(R.id.text4);
        t5=(TextView)findViewById(R.id.text5);
        t6=(TextView)findViewById(R.id.text6);
        t7=(TextView)findViewById(R.id.text7);
        t8=(TextView)findViewById(R.id.text8);
        t9=(TextView)findViewById(R.id.text9);
        t10=(TextView)findViewById(R.id.text10);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=1;
                color();

                b1.setBackgroundResource(R.color.red);
                table();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=2;
                color();

                b2.setBackgroundResource(R.color.red);
                table();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=3;
                color();

                b3.setBackgroundResource(R.color.red);
                table();
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=4;
                color();

                b4.setBackgroundResource(R.color.red);
                table();
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=5;
                color();

                b5.setBackgroundResource(R.color.red);
                table();
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=6;
                color();

                b6.setBackgroundResource(R.color.red);
                table();
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=7;
                color();

                b7.setBackgroundResource(R.color.red);
                table();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=8;
                color();

                b8.setBackgroundResource(R.color.red);
                table();
            }
        });



        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=9;
                color();

                b9.setBackgroundResource(R.color.red);
                table();
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=10;
                color();
                b10.setBackgroundResource(R.color.red);
                table();
            }
        });








        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=11;
                b11.setBackgroundResource(R.color.red);
                table();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=12;
                color();

                b12.setBackgroundResource(R.color.red);
                table();
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=13;
                color();

                b13.setBackgroundResource(R.color.red);
                table();
            }
        });


        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=14;
                color();

                b14.setBackgroundResource(R.color.red);
                table();
            }
        });


        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=15;
                color();

                b15.setBackgroundResource(R.color.red);
                table();
            }
        });


        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=16;
                color();

                b16.setBackgroundResource(R.color.red);
                table();
            }
        });


        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=17;
                color();

                b17.setBackgroundResource(R.color.red);
                table();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=18;
                color();

                b18.setBackgroundResource(R.color.red);
                table();
            }
        });



        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=19;
                color();

                b19.setBackgroundResource(R.color.red);
                table();
            }
        });


        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tab=20;
                color();
                b20.setBackgroundResource(R.color.red);
                table();
            }
        });


    }

    public void color(){
        b2.setBackgroundResource(R.color.mycol);
        b1.setBackgroundResource(R.color.mycol);
        b3.setBackgroundResource(R.color.mycol);
        b4.setBackgroundResource(R.color.mycol);
        b5.setBackgroundResource(R.color.mycol);
        b6.setBackgroundResource(R.color.mycol);
        b7.setBackgroundResource(R.color.mycol);
        b8.setBackgroundResource(R.color.mycol);
        b9.setBackgroundResource(R.color.mycol);
        b10.setBackgroundResource(R.color.mycol);
        b12.setBackgroundResource(R.color.mycol);
        b11.setBackgroundResource(R.color.mycol);
        b13.setBackgroundResource(R.color.mycol);
        b14.setBackgroundResource(R.color.mycol);
        b15.setBackgroundResource(R.color.mycol);
        b16.setBackgroundResource(R.color.mycol);
        b17.setBackgroundResource(R.color.mycol);
        b18.setBackgroundResource(R.color.mycol);
        b19.setBackgroundResource(R.color.mycol);
        b20.setBackgroundResource(R.color.mycol);


    }
    public void table(){

        t1.setText(tab+" X "+1+"="+(tab*1));

        t2.setText(tab+" X "+2+"="+(tab*2));
        t3.setText(tab+" X "+3+"="+(tab*3));
        t4.setText(tab+" X "+4+"="+(tab*4));
        t5.setText(tab+" X "+5+"="+(tab*5));
        t6.setText(tab+" X "+6+"="+(tab*6));
        t7.setText(tab+" X "+7+"="+(tab*7));
        t8.setText(tab+" X "+8+"="+(tab*8));
        t9.setText(tab+" X "+9+"="+(tab*9));
        t10.setText(tab+" X "+10+"="+(tab*10));

    }
}
