package com.mygdx.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Ameba extends Protozoa  {

    private Texture ameba;

    public Ameba(int x, int y) {
        super(new Texture("ameba.png"),10);

    }
    public void evolution(SpriteBatch sb){

        long a = rand.nextLong()% 50+50;
        if(a<4 && a>0){
            //sb.draw(ameba,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


        }
    }

    public Ameba(Texture sprite, int speed, Texture ameba) {
        super(sprite, speed);
        this.ameba = ameba;
    }


    public void evolution() {

    }
}
