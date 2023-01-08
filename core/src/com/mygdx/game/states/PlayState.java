
package com.mygdx.game.states;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.MyGame;
import com.mygdx.game.sprites.Ameba;
import com.mygdx.game.sprites.PlayStage;
import com.mygdx.game.sprites.Protozoa;
import com.badlogic.gdx.scenes.scene2d.Actor;
//import ru.habrahabr.songs_of_the_space.objects.PlayStage;
//import com.badlogic.gdx.states.states2d.Stage;
//import com.mygdx.game.states.Actor;

import java.util.ArrayList;
import java.util.Random;

public class PlayState implements Screen {
    final MyGame game;
    private Ameba ameba;
   // private Stage stage;
   private PlayStage stage;
    //private Actor actor;

    public Random rand;
public Vector2 vector;
public int speed =10;
    public int x=Gdx.input.getX(), y=Gdx.input.getY();

    public int roundTime = 0;
    protected Texture background;
    //прописать кнопку для настроек
   // ArrayList<Protozoa> arrayList= new ArrayList<>();
    Array<Ameba> arrayList;
  //  public SpriteBatch sb;


  //  SpriteBatch batch;
 // final MyGame game;

    // массив простейших

    public PlayState(final MyGame gam) {
        //super(gsm);
        game=gam;
        //batch = new SpriteBatch();
        stage = new PlayStage(new ScreenViewport());
        ameba= new Ameba(50,300);
        stage.addActor(game.background);


       // ArrayList<Protozoa> arrayList = new ArrayList<Protozoa>();

       // ameba = new Texture(Gdx.files.internal("ameba1.png"));

       // background = new Texture("black.jpeg");
     //   camera.setToOrtho(false, MyGame.WIDTH / 2, MyGame.HEIGHT / 2);
       // arrayList.add(new Ameba(ameba,10));
    }

   // @Override
   // public void render(float dt) {

   // }

 //   @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
        //render();
            for(final Ameba i: arrayList){
                      stage.addActor(i);
                      i.move();
                    }
         }
    }

   // protected void handleInput(SpriteBatch sb) {
     //   sb.setProjectionMatrix(camera.combined);
        //  int x1,y1;
        // if(Gdx.input.justTouched()) {
          //  x1 = Gdx.input.getX();
          // y1 = Gdx.input.getY();
       // sb.begin();
       // sb.draw(ameba, x, y);
       // sb.end();
        // }

  //  }

  //  @Override
    public void update(float dt) {
// пробежатся по массиву и вызывать метод move
      //  for (Protozoa b : arrayList) {
        handleInput();
       // ameba.update(dt);

       // sb.draw(ameba, x, y,width,height);
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
    public void show() {

    }

    @Override
    public void render(float delta) {
        //this.sb=sb;
       // delta.setProjectionMatrix(camera.combined);
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
       // camera.update();
       // batch.setProjectionMatrix(camera.combined);
      //  for (Protozoa b : arrayList) {
      //      b.move();
            //sb.draw(ameba)
      //  }

        stage.act(delta);
        stage.draw();
        //sb.begin();

            // sb.begin();
            // = touchPos.x - 64 / 2;
         // update(float dt);

       // int width=100;
      //  int height=100;
     //   sb.draw(ameba, x, y,width,height);

            //  sb.end();





        //sb.setColor(Color.BLUE);
        //sb.draw(background, 0, 0, MyGame.WIDTH, MyGame.HEIGHT);
      //  sb.end();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }


    @Override
    public void dispose() {
        //background.dispose();
       // ameba.dispose();
        game.dispose();
    }

    public void startRound()
    {
        roundTime=60;
    }
    public boolean isEnded(float dt)
    {
        roundTime-=dt;
       // int i = 10;
        while(roundTime!=0 )
        { for(Protozoa b : arrayList) {

            b.evolutionam();

            return true;
        }
        }
        return false;
    }
}
