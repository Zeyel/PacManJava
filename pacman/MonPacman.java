package com.pacman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.*;
import com.view.*;

public class MonPacman extends ApplicationAdapter {
	SpriteBatch batch;
	World world;
	//Pacman p;
	WorldRenderer renderer;
	
	@Override
	public void create () {
		//p = new Pacman(m,1,2);
		world = new World(new Labyrinth(world));
		batch = new SpriteBatch();
		renderer = new WorldRenderer(world, batch);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
