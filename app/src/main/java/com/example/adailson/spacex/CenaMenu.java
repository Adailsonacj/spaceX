package com.example.adailson.spacex;

import com.example.adailson.spacex.AndGraph.AGGameManager;
import com.example.adailson.spacex.AndGraph.AGInputManager;
import com.example.adailson.spacex.AndGraph.AGScene;
import com.example.adailson.spacex.AndGraph.AGScreenManager;
import com.example.adailson.spacex.AndGraph.AGSprite;
import com.example.adailson.spacex.AndGraph.AGTimer;

public class CenaMenu extends AGScene {

    AGSprite menu = null;
    AGSprite play = null;
    AGSprite duvida = null;
    AGSprite sair = null;
    int i = 0;

    public CenaMenu(AGGameManager gameManager) {
        super(gameManager);
    }

    @Override
    public void init() {

        menu = createSprite(R.mipmap.spacexx, 1, 1);
        menu.setScreenPercent(80, 20);
        menu.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2 + 700);

        play = createSprite(R.mipmap.play, 1, 1);
        play.setScreenPercent(15, 13);
        play.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2 + 400);

        duvida = createSprite(R.mipmap.ask, 1, 1);
        duvida.setScreenPercent(15, 13);
        duvida.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2-50);

        sair = createSprite(R.mipmap.exit, 1, 1);
        sair.setScreenPercent(15, 13);
        sair.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2 - 450);
        setSceneBackgroundColor(1, 1, 1);

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {

        if (AGInputManager.vrTouchEvents.screenClicked()) {
            vrGameManager.setCurrentScene(2);
        }
    }
}
