package com.example.sam19.mathblast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashadd extends AppCompatActivity {
            Button eayadd,esymed,esyhrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashadd);
        eayadd=(Button)findViewById(R.id.easyadda);
        esyhrd=(Button)findViewById(R.id.hardadda);
        esymed=(Button)findViewById(R.id.medadda);



        eayadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();

                b.putString("idd","1");
                Intent intent = new Intent(dashadd.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        esymed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();

                b.putString("idd","2");
                Intent intent = new Intent(dashadd.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });


        esyhrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","3");
                Intent intent = new Intent(dashadd.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
