package com.devsol.ap_rs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.devsol.ap_rs.R;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.lightBlue)
                .backgroundDark(R.color.darkBlue)
                .fragment(R.layout.intro_um)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.lightBlue)
                .backgroundDark(R.color.darkBlue)
                .fragment(R.layout.intro_dois)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.lightBlue)
                .backgroundDark(R.color.darkBlue)
                .fragment(R.layout.intro_tres)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.lightBlue)
                .backgroundDark(R.color.darkBlue)
                .fragment(R.layout.intro_quatro)
                .build());

        addSlide(new FragmentSlide.Builder()
                .background(R.color.lightBlue)
                .backgroundDark(R.color.darkBlue)
                .fragment(R.layout.intro_login)
                .canGoForward(false)
                .build());

    }


    //abrir tela de cadastro
    public void abrirTelaCadastrar(View view){

        startActivity(new Intent(getApplicationContext(), CadastroActivity.class));

    }

    public void abrirFeed(View view){
        startActivity(new Intent(getApplicationContext(), FeedActivity.class));
    }
}
