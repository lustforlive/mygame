package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGame;
//import com.sun.imageio.plugins.jpeg.JPEGImageWriter;

public class MenuState implements Screen {
;
   // public SpriteBatch sb;
     MyGame game;

    private final Texture background;

    private final Texture playbutton;


    public MenuState( MyGame game) {
        // super(gam);
        this.game = game;
        background = new Texture("black.jpeg");
        playbutton = new Texture("button.png");
        // super(gsm);
       /* this.stage.addActor(game.background);

        Skin skin = new Skin();
        TextureAtlas buttonAtlas = new TextureAtlas(Gdx.files.internal("button.png"));
        skin.addRegions(buttonAtlas);
        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = game.font;
        textButtonStyle.up = skin.getDrawable("button-up");
        textButtonStyle.down = skin.getDrawable("button-down");
        textButtonStyle.checked = skin.getDrawable("button-up");

        this.labelStyle = new Label.LabelStyle();
        this.labelStyle.font = game.font;
        this.table = new Table();
        this.table.setFillParent(true);
        this.play = new TextButton("Играть", textButtonStyle);
        this.play.addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                Gdx.input.vibrate(20);
                return true;
            }
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                MenuState.this.game.setScreen(new PlayState(game));
                MenuState.this.dispose();
            }

        });
        this.table.add(play);
        this.table.row();
        //table.add(exit);
      //  this.stage.addActor(table);
      //  Gdx.input.setInputProcessor(stage);
  */
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(new InputProcessor() {
            @Override
            public boolean keyDown(int keycode) {
                return false;
            }

            @Override
            public boolean keyUp(int keycode) {
                return false;
            }

            @Override
            public boolean keyTyped(char character) {
                return false;
            }

            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                return false;
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                return false;
            }

            @Override
            public boolean touchDragged(int screenX, int screenY, int pointer) {
                return false;
            }

            @Override
            public boolean mouseMoved(int screenX, int screenY) {
                return false;
            }

            @Override
            public boolean scrolled(float amountX, float amountY) {
                return false;
            }
        });

    }


        public void render (float delta){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
         MyGame.batch.begin();
         if (Gdx.input.justTouched()){

            this.game.setScreen(new PlayState());
         }
         MyGame.batch.begin();
         MyGame.batch.draw(MyGame.img,0,0);
         MyGame.batch.draw(background,0,0);
         MyGame.batch.draw(playbutton,MyGame.WIDTH/2,MyGame.HEIGHT/2);
         MyGame.batch.end();

           // this.stage.act(delta);
            //this.stage.draw();



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
        public void dispose () {

        this.game.dispose();



        }
        public void GameUpdate(){
            if (Gdx.input.justTouched()){
                game.setScreen( new PlayState());
            }
        }
    public void draw(SpriteBatch batch) {
       batch.begin();
       MyGame.batch.draw(background,0,0);
       batch.end();
    }


    }
