package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;
    }

    public void incrementaContador(View vista) {
        contador++;
        showResult();
    }

    public void restarContador(View vista) {
        contador--;
        showResult();
    }

    public void resetContador(View vista) {
        contador = 0;
        showResult();
    }

    public void showResult() {
        TextView textResult = (TextView) findViewById(R.id.lblpulsaciones);
        textResult.setText(String.valueOf(contador));
    }
}