package com.mygdx.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public abstract class State {
    private Stage stage;
    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateManage gsm ;
    public State(GameStateManage gsm){
        this.gsm = gsm;
        //stage = new Stage(new ScreenViewport());
        camera = new OrthographicCamera();
        mouse = new Vector3();
    }

  //  public abstract void render(float dt);

    protected abstract void handleInput();



    public abstract void update(float dt);



    public abstract void render(float delta);

    public abstract void dispose();

    public void render() {
    }
}

