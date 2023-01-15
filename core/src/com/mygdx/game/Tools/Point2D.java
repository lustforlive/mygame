package com.mygdx.game.Tools;

import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Point2D {
    Random rand;
    public Vector2 vector = new Vector2();
    public double speed;

    public Point2D(Point2D p){
        x=p.getX();
        y=p.getY();

    }
    private float x,y;
    public Point2D(float x, float y, double speed) {
        this.x = x;
        this.y = y;

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
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float x){
    this.y=y;
    }

}
