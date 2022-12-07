package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public abstract class Protozoa extends Sprite {
    public static Random rand = new Random();
    public Vector2 vector = new Vector2(); // длина вектора равна 1(вектор нормализован)
    public double speed;


    public Protozoa(Texture sprite, int speed) {
        super(sprite);
        this.speed = speed;

    }
    public void move(){
       long a = rand.nextLong() % 50+50; //генерация целого числа из диапозона -50 - +50 (вероятность)

        if(a<3){
            double c = Math.random();
            vector.y = (float) (y*Math.sin(c));
            vector.x = (float) (x*Math.cos(c));
           //перерасчет вектора(в любое ранд напр)
       }
       else if(a<10){
           double X,Y;
           //поворот вектора на угол
           vector.x = (float) (x * Math.cos(a) - y * Math.sin(a));
           vector.y = (float) (x * Math.sin(a) + y * Math.cos(a));
       }
       double dx = vector.x * speed;
       double dy = vector.y * speed;
       this.x += dx;
       this.y += dy;
    }
    public void evolutionam() //эволюция простейших
    {
        long d = rand.nextLong();
        if(d<10) {
            speed = 5 + speed;
        }
        if(d<15){

        }
    }



}
