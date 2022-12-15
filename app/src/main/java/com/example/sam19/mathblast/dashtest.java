package com.example.sam19.mathblast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashtest extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashtest);
        b1=(Button)findViewById(R.id.butt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Bundle b = new Bundle();

                b.putString("idd","16");
                Intent intent = new Intent(dashtest.this,Splash.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
