package com.example.sam19.mathblast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class easyaddmed extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bclear;
    TextView tv;
    EditText et,rite,wrng;
    int count=0,ans,a,b,score=0,galat=0;
    String ttime;

    private TextView textTimer;
    private long startTime = 0L;
    private Handler myHandler = new Handler();
    long timeInMillies = 0L;
    long timeSwap = 0L;
    long finalTime = 0L;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easyaddmed);
        b1=(Button)findViewById(R.id.button1);
        rite=(EditText)findViewById(R.id.right);
        wrng=(EditText)findViewById(R.id.wrong);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);
        bclear=(Button)findViewById(R.id.buttonclear);
        tv=(TextView)findViewById(R.id.textview);
        et=(EditText)findViewById(R.id.edit);
        textTimer = (TextView) findViewById(R.id.textTimer);




        rite.setBackgroundResource(R.color.right);
        wrng.setBackgroundResource(R.color.wrong);



        startTime = SystemClock.uptimeMillis();
        myHandler.postDelayed(updateTimerMethod, 0);

        question();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"1");
                et.setBackgroundColor(16777215);

                checkk();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"2");
                et.setBackgroundColor(16777215);



                checkk();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"3");
                et.setBackgroundColor(16777215);



                checkk();


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"4");
                et.setBackgroundColor(16777215);


                checkk();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"5");
                et.setBackgroundColor(16777215);


                checkk();


            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"6");
                et.setBackgroundColor(16777215);



                checkk();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"7");
                et.setBackgroundColor(16777215);



                checkk();


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"8");
                et.setBackgroundColor(16777215);

                checkk();




            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"9");
                et.setBackgroundColor(16777215);

                checkk();

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et.getText().toString();
                et.setText(s+"0");
                et.setBackgroundColor(16777215);
                checkk();

            }
        });


        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et.setText("");

            }
        });


    }



    public void checkk(){



        if(Integer.parseInt(et.getText().toString())==ans){

            score++;
            et.setText("");
            question();
        }





        else if(et.getText().toString().length()==String.valueOf(ans).length())
        {
            wrong();
        }



    }








    void question(){

        if(count<20){
            count++;


            String s;
            s = String.valueOf(score);
            rite.setText(s);



            rand();

            tv.setText(a+"+"+b);
            ans = a+b;


            if(count==20) {

                timeSwap += timeInMillies;
                myHandler.removeCallbacks(updateTimerMethod);
                tv.setText("end");
            }
        }
        else{

            Intent intent = new Intent(easyaddmed.this,dashadd.class);
            startActivity(intent);


        }


    }

    private Runnable updateTimerMethod = new Runnable() {

        public void run() {
            timeInMillies = SystemClock.uptimeMillis() - startTime;
            finalTime = timeSwap + timeInMillies;

            int seconds = (int) (finalTime / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;
            int milliseconds = (int) (finalTime % 1000);
            ttime="" + minutes + ":"
                    + String.format("%02d", seconds) + ":"
                    + String.format("%03d", milliseconds);
            textTimer.setText(ttime);
            myHandler.postDelayed(this, 0);
        }

    };






    public void wrong() {
        Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 500 milliseconds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vib.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            //deprecated in API 26
            vib.vibrate(500);
        }
        Toast.makeText(easyaddmed.this, "wrong answer", Toast.LENGTH_SHORT).show();
        question();
        et.setText("");
        galat++;
        String s;
        s = String.valueOf(galat);
        wrng.setText(s);




    }


    public void rand(){



        Random rand = new Random();
        a = rand.nextInt(100)+0;
        b= rand.nextInt(100)+1;


        return;
    }

}
