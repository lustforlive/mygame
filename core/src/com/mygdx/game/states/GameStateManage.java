package com.mygdx.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManage {

    public BackgroundActor background;
    // public BitmapFont font;
    //управляет игровыми состояниями(окнами)
    private Stack<State> states;


    public GameStateManage() {
       states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
       states.pop().dispose();
    }

    public void set(State state){
       states.pop().dispose();
       states.push(state);
    }
    public void update(float dt){
       states.peek().update(dt);
    }

    public void render(float delta){
       states.peek().render(delta);
    }
}
