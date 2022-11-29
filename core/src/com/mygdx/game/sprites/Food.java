package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Food {
    protected SpriteBatch batch;
    protected GlyphLayout glyphLayout;
    protected ShapeRenderer shapeRenderer;

    protected int hue = 300;
    protected double posX = 200;
    protected double posY = 200;
    protected int mass = 200;

    public Food(SpriteBatch batch, ShapeRenderer shapeRenderer, double d, double e, int mass, float hue) {
        super();
        this.batch = batch;
        this.shapeRenderer = shapeRenderer;
        this.posX = d;
        this.posY = e;
        this.mass = mass;

    }

    public void rendererDraw() {

        shapeRenderer.circle((float) posX, (float) posY, mass);
    }

    public void translate(int offsetX, int offsetY) {
        posX += offsetX;
        posY += offsetY;
    }

    public void setHue(int h) {
        this.hue = h;

    }

    public int getHue() {
        return hue;
    }

    public double getX() {
        return this.posX;
    }

    public double getY() {
        return this.posY;
    }

    public void setX(double x) {
        posX = x;
    }

    public void setY(double y) {
        posY = y;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int m) {
        this.mass = m;
    }
}