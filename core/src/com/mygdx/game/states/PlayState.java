package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGame;
import com.mygdx.game.sprites.Ameba;
import com.mygdx.game.sprites.Food;

public class PlayState extends State{
    private Ameba ameba;
    private Food food;
    protected Texture background;

    // массив простейших
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
// пробежатся по массиву и вызывать метод move
    }

    @Override
    public void render(SpriteBatch sb) {
         sb.setProjectionMatrix(camera.combined);
         sb.begin();
         sb.draw(background,0,0, MyGame.WIDTH, MyGame.HEIGHT);


         sb.end();

    }

    @Override
    public void dispose() {

    }
}
