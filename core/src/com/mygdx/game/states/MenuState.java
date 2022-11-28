package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGame;

public class MenuState extends State{
    private Texture background;
    private Texture playBtn;
    public MenuState(GameStateManage gsm) {
        super(gsm);
        background = new Texture("black.jpeg");
        playBtn = new Texture("button.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, MyGame.WIDTH, MyGame.HEIGHT);
        sb.draw(playBtn, (MyGame.WIDTH / 2) - (playBtn.getWidth() / 2), MyGame.HEIGHT / 2);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
