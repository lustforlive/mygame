package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.MyGame;
import com.mygdx.game.sprites.Ameba;
import com.mygdx.game.sprites.Protozoa;

import java.util.ArrayList;
import java.util.Random;

public class PlayState extends State {
    private Texture ameba;
public Random rand;
public Vector2 vector;
public int  speed =10;
    public int x=Gdx.input.getX(), y=Gdx.input.getY();

    public int roundTime = 0;
    protected Texture background;
    //прописать кнопку для настроек
    ArrayList<Protozoa> arrayList= new ArrayList<>();
    public SpriteBatch sb;


    SpriteBatch batch;


    // массив простейших

    public PlayState(GameStateManage gsm) {
        super(gsm);
        batch = new SpriteBatch();


        ArrayList<Protozoa> arrayList = new ArrayList<Protozoa>();

        ameba = new Texture(Gdx.files.internal("ameba1.png"));

        background = new Texture("black.jpeg");
        camera.setToOrtho(false, MyGame.WIDTH / 2, MyGame.HEIGHT / 2);
        arrayList.add(new Ameba(ameba,10));
    }

    @Override
    public void render(float dt) {

    }

    @Override
    protected void handleInput() {
        // if(Gdx.input.justTouched()){
        //render();
        // }
    }

    protected void handleInput(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        //  int x1,y1;
        // if(Gdx.input.justTouched()) {
          //  x1 = Gdx.input.getX();
          // y1 = Gdx.input.getY();
       // sb.begin();
       // sb.draw(ameba, x, y);
       // sb.end();
        // }
    }

    @Override
    public void update(float dt) {
// пробежатся по массиву и вызывать метод move
      //  for (Protozoa b : arrayList) {
        for (Protozoa b : arrayList) {
            b.move();
        }
        int width=100;
        int height=100;
        sb.draw(ameba, x, y,width,height);
           // b.move();
       // if (Gdx.input.justTouched()) {

           // for (int i = 0; i < arrayList.size(); i++) {
               // Protozoa b = arrayList.get(i);
                //for(int i = 0; i<arrayList.size(); i++) {
                //Protozoa b = arrayList.get(i);




                //  float x1 = 0, y1 = 0;

                //sb.setProjectionMatrix(camera.combined);
                // if (Gdx.input.justTouched()) {
            }


           // Vector3 touchPos = new Vector3();
           // touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            //camera.unproject(touchPos);

            // }

      //  }





    @Override
    public void render(SpriteBatch sb) {
        this.sb=sb;
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
       // batch.setProjectionMatrix(camera.combined);
        for (Protozoa b : arrayList) {
            b.move();
            //sb.draw(ameba)
        }


        sb.begin();

            // sb.begin();
            // = touchPos.x - 64 / 2;
         // update(float dt);

        int width=100;
        int height=100;
        sb.draw(ameba, x, y,width,height);

            //  sb.end();





        //sb.setColor(Color.BLUE);
        //sb.draw(background, 0, 0, MyGame.WIDTH, MyGame.HEIGHT);
        sb.end();
    }




    @Override
    public void dispose() {
        background.dispose();
        ameba.dispose();
    }

    public void startRound()
    {
        roundTime=60;
    }
    public boolean isEnded(float dt)
    {
        roundTime-=dt;
       // int i = 10;
        while(roundTime!=0 || arrayList.size()!=10)
        { for(Protozoa b : arrayList) {

            b.evolutionam();

            return true;
        }
        }
        return false;
    }
}
