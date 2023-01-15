package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.GraphicsObj.GraphicsObj;

public class Sprite extends GraphicsObj {
    public double x;
    public double y;
   // public Texture sprite;

    public Sprite(Texture sprite) {
        super(sprite);


    }

    public void draw(SpriteBatch batch) {
      // batch.draw(img, (float) x,(float)y);
    }

    @Override
    public void update() {

    }
}
