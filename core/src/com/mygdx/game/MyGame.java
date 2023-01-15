package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.BackgroundActor;
//import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.mygdx.game.states.IActivityRequestHandler;
import com.mygdx.game.states.MenuState;
import com.mygdx.game.states.XMLparse;
//import com.mygdx.sprites.IActivityRequestHandler;
import java.util.HashMap;

public class MyGame extends Game {
	private IActivityRequestHandler myRequestHandler;

	public BitmapFont font, levels;
	private static final String FONT_CHARACTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;,{}\"´`'<>";
	public BackgroundActor background;
	public HashMap<String, String> langStr = new HashMap<String, String>();
	public static final int WIDTH = Gdx.graphics.getWidth();
	public static final int HEIGHT = Gdx.graphics.getHeight();
	public static final String TITLE = "ЭВОЛЮЦИЯ";
	//private GameStateManage gsm;
	//public BackgroundActor background;
	public static SpriteBatch batch;
	public static Texture img;
	public MyGame(IActivityRequestHandler handler) {
		this.myRequestHandler=handler;
	}
	public IActivityRequestHandler getHandler() {
		return this.myRequestHandler;
	}

	@Override
	public void create () {

		font.setColor(Color.WHITE);

		batch = new SpriteBatch();

		background = new BackgroundActor();
		background.setPosition(0, 0);
		XMLparse xmlParse = new XMLparse();
		String locale = java.util.Locale.getDefault().toString().split("_")[0];
		langStr = xmlParse.XMLparseLangs(locale);

		this.setScreen(new MenuState(this));
	}

	@Override
	public void dispose () {
		batch.dispose();

	}
}
