package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.MyGame;
import com.sun.imageio.plugins.jpeg.JPEGImageWriter;

public class MenuState extends State {
   // final GameStateManage game;

    private Texture background;
   // private final ImageButton playBtn;
    //private Stage stage;
   SpriteBatch batch;
    //private Texture myTexture;
    //private TextureRegion myTextureRegion;
    //private TextureRegionDrawable myTexRegionDrawable;
  private Texture playbutton;

   // public ImageButton getPlayBtn() {
    //    return playBtn;
   // }
   private Stage stage;

    private TextButton play, exit;

    private Table table;

    private Label.LabelStyle labelStyle;
    private MenuState game;


    public MenuState(final GameStateManage gam) {
        super(gam);

        //super(gsm);
       // playbutton = new Texture("button.png");
        final GameStateManage game = gsm;

        background = new Texture("black.jpeg");
        Skin skin = new Skin();

        TextureAtlas buttonAtlas = new
                TextureAtlas(Gdx.files.internal("button.png"));

        skin.addRegions(buttonAtlas);

        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();

        textButtonStyle.font =game.font ;

        textButtonStyle.up = skin.getDrawable("button-up");

        textButtonStyle.down = skin.getDrawable("button-down");

        textButtonStyle.checked = skin.getDrawable("button-up");

        labelStyle = new Label.LabelStyle();

        labelStyle.font = game.font;

        table = new Table();

        table.setFillParent(true);

        play = new TextButton("Играть", textButtonStyle);
       // final GameStateManage finalGame = game;
       // final GameStateManage finalGame1 = game;
        play.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.input.vibrate(20);
                return true;
            };
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                game.set(new PlayState(game));
                dispose();
            };
        });

       // Texture myTexture = new Texture(Gdx.files.internal("button.png"));
       // TextureRegion myTextureRegion = new TextureRegion(myTexture);
       // TextureRegionDrawable myTexRegionDrawable = new TextureRegionDrawable(myTextureRegion);
      //  playBtn= new ImageButton(myTexRegionDrawable);

       // stage= new Stage(new ScreenViewport());
       // stage.addActor(playBtn); //Add the button to the stage to perform rendering and take input.
      //  Gdx.input.setInputProcessor(stage);
       // game = null;
    }
    @Override
    public void render(float dt) {
        // Очищаем экран и устанавливаем цвет фона черным
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Рисуем сцену

            stage.act(dt);
            stage.draw();
        }


    @Override
    protected void handleInput() {
       // if(Gdx.input.justTouched()){
          //  gam.set(new PlayState(gsm));

        }

        // if(playBtn.isTouchable()){
        //   {

   // }
        //(gsm.set(new PlayState(gsm));
       // }
    @Override
    public void update(float dt) {
        handleInput();

    }



    @Override
    public void render(SpriteBatch sb) {
      //  sb.begin();
        //super.render();
       // sb.draw(background, 0, 0, MyGame.WIDTH, MyGame.HEIGHT);
       // sb.draw(playbutton, (MyGame.WIDTH / 2)- (playbutton.getWidth() / 2) ,MyGame.HEIGHT / 2-250);
        //sb.draw(myTexture,10,10);
       // sb.draw(myTextureRegion,10,10);
        //
//sb.draw(stage, new float[]{stage.getWidth()},stage.getHeight());
        //stage.act(Gdx.graphics.getDeltaTime());
      //  stage.draw();
       // playBtn.draw(sb,parentAlpha);

       // sb.draw(background,0,0, MyGame.WIDTH, MyGame.HEIGHT);
//        stage.draw();
//        ; //Perform ui logic

      // sb.end();

    }

    @Override
    public void dispose() {
       // background.dispose();
     //   playbutton.dispose();
       // stage.dispose();
        stage.dispose();

        
        game.dispose();



    }

}
