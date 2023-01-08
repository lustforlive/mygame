package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Sprite extends Actor {
    public double x;
    public double y;
    public Texture sprite;

    public Sprite(Texture sprite) {
        this.sprite = sprite;


    }

    public void draw(Batch batch) {
    }
}
