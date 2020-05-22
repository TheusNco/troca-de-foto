package com.example.trocafto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private Button cavalo;
        private Button gato;
        private Button galinha;
        private Button cachorro;
        private ImageView troca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cavalo = (Button) findViewById(R.id.btncavalo);
        gato = (Button) findViewById(R.id.btngato);
        galinha = (Button) findViewById(R.id.btngalinha);
        cachorro = (Button) findViewById(R.id.btncachorro);
        troca = (ImageView) findViewById(R.id.imgtroca);

    }

    public void clickCavalo(View view){

    }
}
