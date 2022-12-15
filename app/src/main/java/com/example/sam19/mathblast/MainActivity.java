package com.example.sam19.mathblast;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div,mod,mix,tablee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.dashadd);
        mul=(Button)findViewById(R.id.dashmul);

        sub=(Button)findViewById(R.id.dashsub);

        div=(Button)findViewById(R.id.dashdiv);
        mod=(Button)findViewById(R.id.dashmod);
        mix=(Button)findViewById(R.id.dashtest);
        tablee=(Button)findViewById(R.id.tablee);


        tablee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),table.class);
                startActivity(i);
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),dashadd.class);
                startActivity(i);
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),dashmul.class);
                startActivity(i);
            }
        });



        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),dashsub.class);
                startActivity(i);
            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),dashdiv.class);
                startActivity(i);
            }
        });


        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,dashmod.class);
                startActivity(i);
            }
        });


        mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),dashtest.class);
                startActivity(i);
            }
        });


        }
}
