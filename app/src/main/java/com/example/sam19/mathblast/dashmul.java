package com.example.sam19.mathblast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashmul extends AppCompatActivity {
    Button eayadd,esymed,esyhrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashmul);
        eayadd=(Button)findViewById(R.id.easyadd);
        esyhrd=(Button)findViewById(R.id.hardadd);
        esymed=(Button)findViewById(R.id.medadd);


        eayadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","10");
                Intent intent = new Intent(dashmul.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        esymed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","11");
                Intent intent = new Intent(dashmul.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });


        esyhrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","12");
                Intent intent = new Intent(dashmul.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
