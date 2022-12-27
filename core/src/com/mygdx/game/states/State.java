package com.mygdx.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {
    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateManage gsm ;
    public State(GameStateManage gsm){
        this.gsm = gsm;
        camera = new OrthographicCamera();
        mouse = new Vector3();
    }

    public abstract void render(float dt);

    protected abstract void handleInput();



    public abstract void update(float dt);



    public abstract void render(SpriteBatch sb);

    public abstract void dispose();

    public void render() {
    }
}

