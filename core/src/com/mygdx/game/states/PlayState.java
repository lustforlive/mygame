package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGame;
import com.mygdx.game.sprites.Ameba;

public class PlayState extends State{
    private Ameba ameba;
     public PlayState(GameStateManage gsm) {
        super(gsm);
        ameba = new Ameba(50,300);
        camera.setToOrtho(false,MyGame.WIDTH/2,MyGame.HEIGHT/2 );
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
         sb.setProjectionMatrix(camera.combined);
         sb.begin();
        sb.draw(ameba.getAmeba(), ameba.getPosition().x, ameba.getPosition().y);
         sb.end();

    }

    @Override
    public void dispose() {

    }
}
