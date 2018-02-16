package com.pacman.game.pacman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pacman.game.model.*;

public class MonPacman extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Monde m;
	Pacman p;
	
	@Override
	public void create () {
		p = new Pacman();
		m = new Monde(new Labyrinthe(600, 800));
		batch = new SpriteBatch();
		img = new Texture("bloc.png");
		img2 = new Texture("images/pacman-3.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(img2, 30, 30);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
