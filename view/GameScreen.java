package com.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.Labyrinth;
import com.model.World;

public class GameScreen{
	
	private World world;
	private WorldRenderer renderer;
	private SpriteBatch batch;
		
	public GameScreen(){
		world = new World(new Labyrinth(world));
		batch = new SpriteBatch();
		renderer = new WorldRenderer(world, batch);
	}
	
	public void show(){
		//TODO
	}

	public void render(float f){
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.render();
	}

	public void resize(int h, int l){
		//TODO
	}
	
	public void hide(){
		//TODO
	}

	public void pause(){
		//TODO
	}

	public void resume(){
		//TODO
	}

	public void dispose(){
		batch.dispose();
	}
}