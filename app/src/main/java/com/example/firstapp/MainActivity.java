package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sorter(View view) {
        Random rmd = new Random();
        int number = rmd.nextInt(10) +1;

        EditText chute = findViewById(R.id.field_Chute);
        TextView sorted = findViewById(R.id.txt_Sorteio);
        TextView result = findViewById(R.id.txt_Resultado);
        String randomNumber = String.valueOf(number);
        sorted.setText(randomNumber);

        if(number == Integer.parseInt(chute.getText().toString())){
            result.setText("Ganhador!");
        } else {
            result.setText("Perdedor!");
        }
    }
}