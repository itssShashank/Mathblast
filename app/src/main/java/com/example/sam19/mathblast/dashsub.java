package com.example.sam19.mathblast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashsub extends AppCompatActivity {
    Button eayadd,esymed,esyhrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashsub);

        eayadd=(Button)findViewById(R.id.easyaddd);
        esyhrd=(Button)findViewById(R.id.hardaddd);
        esymed=(Button)findViewById(R.id.medaddd);


        eayadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","13");
                Intent intent = new Intent(dashsub.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        esymed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","14");
                Intent intent = new Intent(dashsub.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });


        esyhrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","15");
                Intent intent = new Intent(dashsub.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
