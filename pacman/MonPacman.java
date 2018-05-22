package com.pacman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.model.*;

public class MonPacman extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Monde m;
	Pacman p;
	
	@Override
	public void create () {
		p = new Pacman(m,1,2);
		m = new Monde(new Labyrinthe(m));
		batch = new SpriteBatch();
		img = new Texture("bloc.png");
		img2 = new Texture("images/pacman-3.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(m.getLabyrinthe().iterator().next().getTexture(), m.getLabyrinthe().iterator().next().getX(), m.getLabyrinthe().iterator().next().getY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
