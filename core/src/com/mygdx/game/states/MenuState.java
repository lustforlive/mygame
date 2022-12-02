package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.mygdx.game.MyGame;

public class MenuState extends State{
    protected Texture background;
    protected ImageButton playBtn;
    public MenuState(GameStateManage gsm) {
        super(gsm);
        background = new Texture("black.jpeg");
        playBtn = new ImageButton("button.png");
    }

    @Override
    protected void handleInput() {
        if(
            gsm.set(new PlayState(gsm));
        }

    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, MyGame.WIDTH, MyGame.HEIGHT);
        sb.draw();
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();


    }
}
