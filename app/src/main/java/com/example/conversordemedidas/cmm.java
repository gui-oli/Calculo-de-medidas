package com.example.conversordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmm);

        final EditText edtKm4_Prog = (EditText)findViewById(R.id.edtKm4);
        final EditText edtM4_Prog = (EditText)findViewById(R.id.edtM4);
        Button btnConverter4 = (Button)findViewById(R.id.btnConverter4);
        Button btnNovo4 = (Button)findViewById(R.id.btnNovo4);

        btnConverter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km4 = Double.parseDouble(edtKm4_Prog.getText().toString());
                double m4 = km4/100;
                edtM4_Prog.setText(String.valueOf(m4));
            }
        });

        btnNovo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM4_Prog.setText("");
                edtKm4_Prog.setText("");
                edtKm4_Prog.requestFocus();
            }
        });
    }
}