package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView digitado = (TextView) findViewById(R.id.resultado);

        Intent caminhao = getIntent();
        Bundle caixas = caminhao.getExtras();
        String abrir = caixas.getString("a");

        Toast.makeText(getBaseContext(),abrir,Toast.LENGTH_LONG).show();





    }
}
