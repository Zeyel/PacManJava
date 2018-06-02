package com.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.controller.InputHandler;
import com.model.Maze;
import com.model.World;

public class GameScreen{
	
	private World world;
	private WorldRenderer renderer;
	private SpriteBatch batch;
	private InputHandler inputHandeler;
		
	public GameScreen(World world){
		this.world = world;
		batch = new SpriteBatch();
		renderer = new WorldRenderer(world, batch);
		inputHandeler =  new InputHandler(world);
	}
	
	public void show(){
		//TODO
	}

	public void render(long f){
		
		inputHandeler.handleInput();
		world.update(f);
		
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.render(f);
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