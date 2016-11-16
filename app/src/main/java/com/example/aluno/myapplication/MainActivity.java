package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.Btnok)
    public void clickButao(View view){
        Intent intencao = new Intent(MainActivity.this,Main2Activity.class);

        EditText inf = (EditText) findViewById(R.id.inf);
        String texto = inf.getText().toString();


        Bundle informacao = new Bundle();

        informacao.putString("a",texto);

        intencao.putExtras(informacao);

        startActivity(intencao);

    }
}

