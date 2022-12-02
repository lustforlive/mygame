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
           //перерасчет вектора(в любое ранд напр)


       }
       else if(a<10){
           //поворот вектора на угол
       }
       double dx = vector.x * speed;
       double dy = vector.y * speed;
       this.x += dx;
       this.y += dy;

    }



}
