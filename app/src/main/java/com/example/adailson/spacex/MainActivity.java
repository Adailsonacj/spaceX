package com.example.adailson.spacex;
import android.os.Bundle;

import com.example.adailson.spacex.AndGraph.AGActivityGame;

public class MainActivity extends AGActivityGame {

    private CenaAbertura abertura = null;
    private CenaMenu menu = null;
    private CenaCreditos creditos = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inicializa o motor gráfico
        init(this, false);
        abertura = new CenaAbertura(getGameManager());
        menu = new CenaMenu(getGameManager());
        creditos = new CenaCreditos(getGameManager());

        getGameManager().addScene(abertura);
        getGameManager().addScene(menu);
        getGameManager().addScene(creditos);

    }
}
