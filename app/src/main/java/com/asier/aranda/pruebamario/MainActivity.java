package com.asier.aranda.pruebamario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btnsuma,btnresta ,btnmultiplicacion ,btndivision, btnreset;
    public EditText primerValor,segundoValor;
    public TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuma=(Button) findViewById(R.id.btnsuma);
        btnresta=(Button) findViewById(R.id.btnresta);
        btnmultiplicacion=(Button) findViewById(R.id.btnmultiplicacion);
        btndivision=(Button) findViewById(R.id.btndivision);
        btnreset=(Button) findViewById(R.id.btnreset);
        primerValor=(EditText) findViewById(R.id.primerValor);
        segundoValor=(EditText) findViewById(R.id.segundoValor);
        txtResultado=(TextView) findViewById(R.id.txtResultado);

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primerValor.setText("");
                segundoValor.setText("");
                txtResultado.setText("Resultado");
            }
        });

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 ;
                double n2 ;
                double suma ;
                try {
                    n1 = Double.parseDouble(primerValor.getText().toString());
                    n2 = Double.parseDouble(segundoValor.getText().toString());
                    suma = n1 + n2;

                    txtResultado.setText(String.valueOf(suma));
                } catch (java.lang.NumberFormatException ex) {
                    txtResultado.setText("Resultado: ¡Operador inválido!");
                }
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 ;
                double n2 ;
                double resta;
                try {
                n1 =Double.parseDouble(primerValor.getText().toString());
                n2 =Double.parseDouble(segundoValor.getText().toString());
                resta=n1-n2;

                txtResultado.setText(String.valueOf(resta));

                } catch (java.lang.NumberFormatException ex) {
                    txtResultado.setText("Resultado: ¡Operador inválido!");
                }
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 ;
                double n2 ;
                double multiplicacion ;
                try{
                n1 =Double.parseDouble(primerValor.getText().toString());
                n2 =Double.parseDouble(segundoValor.getText().toString());
                multiplicacion=n1*n2;

                txtResultado.setText(String.valueOf(multiplicacion));
            } catch (java.lang.NumberFormatException ex) {
                txtResultado.setText("Resultado: ¡Operador inválido!");
            }
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 ;
                double n2 ;
                double division ;
                try{
                n1 =Double.parseDouble(primerValor.getText().toString());
                n2 =Double.parseDouble(segundoValor.getText().toString());
                division=n1/n2;

                txtResultado.setText(String.valueOf(division));
        } catch (java.lang.NumberFormatException ex) {
            txtResultado.setText("Resultado: ¡Operador inválido!");
        }
            }
        });



    }
}