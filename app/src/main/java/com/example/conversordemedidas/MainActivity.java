package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btmKmM_prog = (Button)findViewById(R.id.btnKmM);
        Button btnMKm_prog = (Button)findViewById(R.id.btnMKm);
        Button btnMCm_prog = (Button)findViewById(R.id.btnMCm);
        Button btnCmM_prog = (Button)findViewById(R.id.btnCmM);

        btmKmM_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kmm.class);
                startActivity(intent);
            }
        });

        btnMKm_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mkm.class);
                startActivity(intent);
            }
        });

        btnMCm_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mcm.class);
                startActivity(intent);
            }
        });

        btnCmM_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cmm.class);
                startActivity(intent);
            }
        });
    }
}