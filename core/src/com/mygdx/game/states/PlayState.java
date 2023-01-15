
package com.mygdx.game.states;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.MyGame;
import com.mygdx.game.sprites.Ameba;
import com.mygdx.game.sprites.Protozoa;
//import ru.habrahabr.songs_of_the_space.objects.PlayStage;
//import com.badlogic.gdx.states.states2d.Stage;
//import com.mygdx.game.states.Actor;

import java.util.Random;

public class PlayState implements Screen {
     MyGame game;
    private Ameba ameba;

   private PlayStage stage;


    public Random rand;
public Vector2 vector;
public int speed =10;
    public int x=Gdx.input.getX(), y=Gdx.input.getY();

    public int roundTime = 0;
    protected Texture background;
    //прописать кнопку для настроек

    Array<Ameba> arrayList;


    public PlayState() {
        //super(gsm);
        this.game = game;
        //batch = new SpriteBatch();
        stage = new PlayStage(new ScreenViewport());
        ameba = new Ameba(50, 300);
        stage.addActor(game.background);

    }
    protected void handleInput() {
        if(Gdx.input.justTouched()){
        //render();
            for(final Ameba i: arrayList){
                    //  stage.addActor(i);
                      i.move();
                    }
         }
    }

    public void update(float dt) {
// пробежатся по массиву и вызывать метод move

        handleInput();
    }


    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }


    @Override
    public void dispose() {
        //background.dispose();
       // ameba.dispose();
        game.dispose();
    }

    public void startRound()
    {
        roundTime=60;
    }
    public boolean isEnded(float dt)
    {
        roundTime-=dt;
       // int i = 10;
        while(roundTime!=0 )
        { for(Protozoa b : arrayList) {

            b.evolutionam();

            return true;
        }
        }
        return false;
    }
}
