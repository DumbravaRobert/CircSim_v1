package com.dumbravarobert.android.circsim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button St,Set,Cr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        St = (Button) findViewById(R.id.Start);
        Set = (Button) findViewById(R.id.Settings);
        Cr = (Button) findViewById(R.id.Credits);

        Cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Created by Dumbrava Robert",Toast.LENGTH_SHORT).show();

            }
        });

        Set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Setari = new Intent(MainActivity.this,Setari.class);
                startActivity(Setari);
            }
        });
}
}
