package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.GameStateManage;
import com.mygdx.game.states.MenuState;

public class MyGame extends ApplicationAdapter {
	public static final int WIDTH = 2400;
	public static final int HEIGHT = 1080;
	public static final String TITLE = "ЭВОЛЮЦИЯ";
	//private GameStateManage gsm;
	private SpriteBatch batch;
	public BitmapFont font;

	@Override
	public void create () {
		batch = new SpriteBatch();
		//gsm = new  GameStateManage();
		//gsm.push(new MenuState(gsm));

	}

	@Override

	public void render () {
		super.render();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//ScreenUtils.clear(1, 0, 0, 1);
		//gsm.update(Gdx.graphics.getDeltaTime());
	//	gsm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
