package com.mygdx.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.mygdx.game.MyGame;
import com.mygdx.game.Tools.Point2D;

import java.util.ArrayList;

public class Ameba extends Protozoa  {
   ArrayList<Protozoa> arrayList;
private Sprite ameba;
    private Texture img;


    public Ameba(int x, int y) {
        super(new Texture("ameba1.png"),Protozoa.position,Protozoa.speed,Protozoa.R);
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

    public Ameba(Texture sprite) {
        super(sprite, position,speed,R);
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

    public void update() {
        if (position.getX()+R > MyGame.WIDTH)position.setX(MyGame.WIDTH-R);
        if (position.getY() +R > MyGame.HEIGHT)position.setY(MyGame.HEIGHT-R);
        if (position.getX()+R <  0)position.setX(R);
        if (position.getY() +R < 0)position.setY(R);
        position.move() ;
    }

    public void dispose() {
    }
    public void draw(SpriteBatch batch) {

        batch.draw(img,position.getX() -R,position.getY()-R);
    }

    //  public void amebax() {
  //  if(Gdx.input.justTouched()){

   // }
  //  }
  //  public void amebay(){

   // }
}
