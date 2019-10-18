package com.sujanmaharjan008.calculatebmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtHeight, txtWeight, txtBMI, BMIResult;
    private EditText edtHeight, edtWeight;
    private Button btnCalc;
    private int weight, height, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHeight = findViewById(R.id.txtHeight);
        txtWeight = findViewById(R.id.txtWeight);
        txtBMI = findViewById(R.id.bmi);
        BMIResult = findViewById(R.id.BMIResult);
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        weight = Integer.parseInt(edtWeight.getText().toString());
        height = Integer.parseInt(edtHeight.getText().toString());

        result = weight/(height^2);

        BMIResult.setText(Integer.toString(result));
    }
}
