package com.mygdx.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;

public class Ameba extends Protozoa  {
   ArrayList<Protozoa> arrayList;
private Sprite ameba;
    private Texture img;


    public Ameba(int x, int y) {
        super(new Texture("ameba1.png"),10);
        Array<Protozoa> protozoas;
        img= new Texture("ameba1.png");
        img.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        ameba = new Sprite(img);


    }
    public void evolution(SpriteBatch sb){

        double a = Math.random() ;
        if(a<4 && a>0){
            //sb.draw(ameba,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


        }
    }

    public Ameba(Texture sprite, int speed) {
        super(sprite, speed);
      //  this.ameba = ameba;
    }
public void move(){

}

    public void evolution() {

    }

   // @Override
    public void size() {

        double a = Math.random() ;
        if(a<4 && a>0){
            //sb.draw(ameba,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());



       // public void spawn(){
          // Protozoa protozoa = new Protozoa(Texture sprite, int speed);



            // ArrayList<Protozoa> arrayList = new ArrayList<>() ;
         //  int x1 = Gdx.input.getX();
          // int y1 = Gdx.input.getY();
          // arrayList.add(protozoa);

        }

    }
    public void spawn(){
        // Protozoa protozoa = new Protozoa();



        // ArrayList<Protozoa> arrayList = new ArrayList<>() ;
        int x1 = Gdx.input.getX();
        int y1 = Gdx.input.getY();
        // arrayList.add(protozoa);

    }

    public void update(float dt) {
    }

    public void dispose() {
    }
    public void draw(Batch batch, float alpha) {
        this.ameba.draw(batch);
    }

    //  public void amebax() {
  //  if(Gdx.input.justTouched()){

   // }
  //  }
  //  public void amebay(){

   // }
}
