package com.example.sumayresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botton2;
    private Button botton;
    private Button limpiar;

    private TextView text_Resultado;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_Resultado = findViewById(R.id.Resultado);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);

        botton2 = findViewById(R.id.button2);
        botton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_Resultado.setText("Suma ="+suma(Integer.parseInt(edit_numero_uno.getText().toString()), Integer.parseInt(edit_numero_dos.getText().toString())) + "");

            }
        });
        botton = findViewById(R.id.button);
        botton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_Resultado.setText("Resta ="+resta(Integer.parseInt(edit_numero_uno.getText().toString()), Integer.parseInt(edit_numero_dos.getText().toString())) + "");
            }
        });
        limpiar = findViewById(R.id.limpiar);
        limpiar .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_numero_uno.setText("");
                edit_numero_dos.setText("");
                text_Resultado.setText("");
            }
        });
    }
    public int suma (int a, int b){
        return a+b;
    }
    public int resta (int a, int b){
        return a-b;
    }
}
