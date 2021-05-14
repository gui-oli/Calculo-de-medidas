package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);

        final EditText edtKm3_Prog = (EditText)findViewById(R.id.edtKm3);
        final EditText edtM3_Prog = (EditText)findViewById(R.id.edtM3);
        Button btnConverter3 = (Button)findViewById(R.id.btnConverter3);
        Button btnNovo3 = (Button)findViewById(R.id.btnNovo3);

        btnConverter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km3 = Double.parseDouble(edtKm3_Prog.getText().toString());
                double m3 = km3*100;
                edtM3_Prog.setText(String.valueOf(m3));
            }
        });

        btnNovo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM3_Prog.setText("");
                edtKm3_Prog.setText("");
                edtKm3_Prog.requestFocus();
            }
        });
    }
}