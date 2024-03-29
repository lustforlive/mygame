package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Tools.Point2D;
import com.mygdx.game.Tools.Square;

import java.util.Random;

public class Protozoa extends Sprite{
    public static Random rand = new Random();
    public Vector2 vector = new Vector2(); // длина вектора равна 1(вектор нормализован)
    public static double speed;
    public int width;
    public int height;
    public static Point2D position;
    public static float R;
    Square bounds;

    public Protozoa(Texture sprite,Point2D position , double speed, float R) {
       // super(actor);
        super(sprite);
        this.speed = speed;
        this.position = new Point2D(position);
        this.R=R;
        this.bounds = new Square(position ,R);
        vector=new Vector2(0,0);

    }




    public void move() {

        long a = rand.nextLong() % 50 + 50; //генерация целого числа из диапозона -50 - +50 (вероятность)

        if (a < 5) {
            double c = Math.random();
            vector.y = (float) (x * Math.cos(c) - y * Math.sin(c));
            vector.x = (float) (x * Math.sin(c) + y * Math.cos(c));
            //перерасчет вектора(в любое ранд напр)
        } else if (a >=5) {
            double X, Y;

            //поворот вектора на угол
            vector.x = (float) (x * Math.cos(a) - y * Math.sin(a));
            vector.y = (float) (x * Math.sin(a) + y * Math.cos(a));
        }
        double dx = vector.x * speed;
        double dy = vector.y * speed;
        this.x += dx;
        this.y += dy;
       // x+=dx;
       // y+=dy;

    }
    public void evolutionam() //эволюция простейших
    {
        double d = Math.random();
        if(d<0.5) {
            speed = 5 + speed;
            width+=1;
            height+=1;
        }
        if(d<0.8){

        }
    }

//public abstract void size();





}
