package com.example.calculadora;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText num1;
    EditText num2;
    TextView result;
    Button btnsoma;
    Button btnmultiplicar;
    Button btnsub;
    Button btndividir;

    double n1, n2, soma, multiplicacao, subtracao, divisao;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        result=(TextView)findViewById(R.id.result);
        btnsoma=(Button)findViewById(R.id.btnsoma);
        btnmultiplicar=(Button)findViewById(R.id.btnmultiplicar);
        btnsub=(Button)findViewById(R.id.btnsub);
        btndividir=(Button)findViewById(R.id.btndividir);
    }

    public void Somar(View view){
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        soma = n1+n2;

        result.setText(Double.toString(soma));
    }

    public void Multiplicar(View view){
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        multiplicacao=n1*n2;

        result.setText(Double.toString(multiplicacao));
    }

    public void Subtrair(View view){
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
        subtracao=n1-n2;

        result.setText(Double.toString(subtracao));
    }

    public void Dividir(View view){
        n1=Double.parseDouble(num1.getText().toString());
        n2=Double.parseDouble(num2.getText().toString());
       if (n2==0){
           new AlertDialog.Builder(view.getContext())
                   .setTitle("Número inválido!")
                   .setMessage("O zero como segundo número não é uma opção válida.").show();

       } else{
           divisao=n1/n2;
           result.setText(Double.toString(divisao));
       }

    }
}
