package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mkm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkm);

        final EditText edtKm2_Prog = (EditText)findViewById(R.id.edtKm2);
        final EditText edtM2_Prog = (EditText)findViewById(R.id.edtM2);
        Button btnConverter2 = (Button)findViewById(R.id.btnConverter2);
        Button btnNovo2 = (Button)findViewById(R.id.btnNovo2);

        btnConverter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km2 = Double.parseDouble(edtKm2_Prog.getText().toString());
                double m2 = km2/1000;
                edtM2_Prog.setText(String.valueOf(m2));
            }
        });

        btnNovo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM2_Prog.setText("");
                edtKm2_Prog.setText("");
                edtKm2_Prog.requestFocus();
            }
        });

    }
}