package com.pacman;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.controller.InputHandler;
import com.model.World;
import com.view.TextureFactory;
import com.view.WorldRenderer;

public class GameScreen{
	
	private World world;
	private WorldRenderer renderer;
	private SpriteBatch batch;
	private InputHandler inputHandeler;
	private BitmapFont font;
		
	public GameScreen(World world){
		this.world = world;
		batch = new SpriteBatch();
		renderer = new WorldRenderer(world, batch);
		inputHandeler =  new InputHandler(world);
		font = new BitmapFont();
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
		batch.begin();
		
		this.batch.draw(
			TextureFactory.getInstance().getPauseButton(),
			world.getWidth()*16 - 32, world.getHeight()* 16, 32, 32); //très très moche
		
		font.draw(batch, "score : " + world.getScore(), 0, world.getHeight()* 16 + 16);
		batch.end();
		
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