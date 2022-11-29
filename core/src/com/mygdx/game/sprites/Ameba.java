package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Ameba  {
    private Vector3 position;
    private Vector3 velosity;
    private Texture ameba;

    public Ameba(int x, int y) {
        position = new Vector3(x, y, 0);
        velosity = new Vector3(0,0,0);
        ameba = new Texture("ameba.jpg");
    }
    public Vector3 getPosition() {
        return position;
    }
    public Texture getAmeba() {
        return ameba;
    }
}
