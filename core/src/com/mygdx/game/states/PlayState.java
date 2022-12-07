package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGame;
import com.mygdx.game.sprites.Ameba;
import com.mygdx.game.sprites.Food;
import com.mygdx.game.sprites.Protozoa;

import java.util.ArrayList;

public class PlayState extends State{
    private  Ameba ameba;

    public int b=4;
    public int roundTime =0;
    protected Texture background;
    //прописать кнопку для настроек

    ArrayList<Protozoa> arrayList = new ArrayList<>(b) ;
    // массив простейших

     public PlayState(GameStateManage gsm) {
        super(gsm);
         background = new Texture("black.jpeg");
         camera.setToOrtho(false,MyGame.WIDTH/2,MyGame.HEIGHT/2 );
    }
    @Override
    protected void handleInput() {

    }
    @Override
    public void update(float dt) {

// пробежатся по массиву и вызывать метод move
        for(Protozoa b : arrayList) {

           ameba.move();
        }
        }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        //sb.setColor(Color.BLUE);
        //sb.draw(background, 0, 0, MyGame.WIDTH, MyGame.HEIGHT);
        sb.end();
    }




    @Override
    public void dispose() {
        background.dispose();
    }

    public void startRound()
    {
        roundTime=60;
    }
    public boolean isEnded(float dt)
    {
        roundTime-=dt;
        int i = 10;
        if(roundTime<=0 || b<=10)
        {
            ameba.evolutionam();
            ameba.evolution();
            return true;
        }
        return false;
    }
}
