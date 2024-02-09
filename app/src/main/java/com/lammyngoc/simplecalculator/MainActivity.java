package com.lammyngoc.simplecalculator;

import static com.lammyngoc.simplecalculator.R.id.edt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.result);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edt1.getText().toString());
                double num2 = Double.parseDouble(edt2.getText().toString());
                double res = num1 + num2;
                txtResult.setText("Result: " + res);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edt1.getText().toString());
                double num2 = Double.parseDouble(edt2.getText().toString());
                double res = num1 - num2;
                txtResult.setText("Result: " + res);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edt1.getText().toString());
                double num2 = Double.parseDouble(edt2.getText().toString());
                double res = num1 * num2;
                txtResult.setText("Result: " + res);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(edt1.getText().toString());
                double num2 = Double.parseDouble(edt2.getText().toString());
                double res = num1 / num2;
                txtResult.setText("Result: " + res);
            }
        });
    }
}
