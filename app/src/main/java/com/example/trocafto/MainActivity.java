package com.example.trocafto;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
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
//onde vai atribuir a ação do botão pra trocar de imagem 
        cavalo = (Button) findViewById(R.id.btncavalo);
        gato = (Button) findViewById(R.id.btngato);
        galinha = (Button) findViewById(R.id.btngalinha);
        cachorro = (Button) findViewById(R.id.btncachorro);
        troca = (ImageView) findViewById(R.id.imgtroca);

    }

    public void clickCavalo(View view){
        troca.setImageResource(R.drawable.cavalo);
        MediaPlayer mpcavalo = MediaPlayer.create(this, R.drawable.somcavalo);
        mpcavalo.start();
    }
    public void clickGato(View view){
        troca.setImageResource(R.drawable.gato);
        MediaPlayer mpgato = MediaPlayer.create(this, R.drawable.somgato);
        mpgato.start();
    }
    public void clickGalinha(View view){
        troca.setImageResource(R.drawable.galinha);
        MediaPlayer mpgalinha = MediaPlayer.create(this, R.drawable.somgalinha);
        mpgalinha.start();
    }
    public void clickCachorro(View view){
        troca.setImageResource(R.drawable.cachorro);
        MediaPlayer mpcachorro = MediaPlayer.create(this, R.drawable.somcachorro);
        mpcachorro.start();
    }
}
