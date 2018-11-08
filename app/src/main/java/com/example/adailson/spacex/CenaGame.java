package com.example.adailson.spacex;

import com.example.adailson.spacex.AndGraph.AGGameManager;
import com.example.adailson.spacex.AndGraph.AGInputManager;
import com.example.adailson.spacex.AndGraph.AGScene;
import com.example.adailson.spacex.AndGraph.AGScreenManager;
import com.example.adailson.spacex.AndGraph.AGSprite;

public class CenaGame extends AGScene {

    private AGSprite gato = null;
    private int animacao=0;


    public CenaGame(AGGameManager gameManager) {
        super(gameManager);
    }

    @Override
    public void init() {
        setSceneBackgroundColor(1, 1, 0);
        gato = createSprite(R.mipmap.gato, 8, 8);
        gato.setScreenPercent(15, 30);
        gato.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2);
        gato.addAnimation(30,true,0,15);
        gato.addAnimation(10,true,16,28);
        gato.addAnimation(15,true,29,40);

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {
        if(AGInputManager.vrTouchEvents.screenClicked()){
            //vrGameManager.setCurrentScene(1);
            animacao ++;
            if(animacao>2){
                animacao = 0;
            }
            gato.setCurrentAnimation(animacao);
            return;
        }
    }
}
