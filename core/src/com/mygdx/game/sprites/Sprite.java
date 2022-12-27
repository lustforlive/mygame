package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;

public abstract class Sprite {
    public double x;
    public double y;
    public Texture sprite;

    public Sprite(Texture sprite) {
        this.sprite = sprite;


    }

}
