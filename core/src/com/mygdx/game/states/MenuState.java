package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.MyGame;

public class MenuState extends State{
    private final Texture background;
    private final ImageButton playBtn;
    private Stage stage;

    private Texture myTexture;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTexRegionDrawable;


    public ImageButton getPlayBtn() {
        return playBtn;
    }

    public MenuState(GameStateManage gsm) {
        super(gsm);


        background = new Texture("black.jpeg");

        Texture myTexture = new Texture(Gdx.files.internal("button.png"));
        TextureRegion myTextureRegion = new TextureRegion(myTexture);
        TextureRegionDrawable myTexRegionDrawable = new TextureRegionDrawable(myTextureRegion);
        playBtn= new ImageButton(myTexRegionDrawable);

        stage= new Stage(new ScreenViewport());
        stage.addActor(playBtn); //Add the button to the stage to perform rendering and take input.
        Gdx.input.setInputProcessor(stage);
    }
    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
           gsm.set(new PlayState(gsm));
        }

        // if(playBtn.isTouchable()){
        //  gsm.set(new PlayState(gsm) {

    }
        //(gsm.set(new PlayState(gsm));
       // }
    @Override
    public void update(float dt) {
        handleInput();

    }



    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        super.render();
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
       // playBtn.draw(sb,parentAlpha);

        sb.draw(background,0,0, MyGame.WIDTH, MyGame.HEIGHT);
//        stage.draw();
//        ; //Perform ui logic

       sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
       // stage.dispose();


    }

}
