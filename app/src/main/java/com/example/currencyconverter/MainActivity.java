package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeCurrency(View view){
        EditText dollar_amount =(EditText) findViewById(R.id.amount);
        float amount =Float.valueOf(dollar_amount.getText().toString()).floatValue();
         amount =  (amount*73.25f);
        Toast.makeText(this, "In  Indian currency this amount is Rs: "+amount, Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}