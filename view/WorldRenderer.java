package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.TimeUtils;
import com.model.Element;
import com.model.Pacman;
import com.model.World;

public class WorldRenderer{
	private World world;
	private SpriteBatch spriteBatch;
	private float ppuX;
	private float ppuY;
	
	private int pacmanAnimationState = 0;
	private long elapsedTimeSinceLastUpdate = 0;
	private final int pacmanAnimationFrames = 2;
	private final long frameDuration = 200; // in milliseconds
	private final int pacmanTextureHeight = 16;
	private final int pacmanTextureWidth = 16;
	
	public WorldRenderer(World world, SpriteBatch sb){
		this.world = world;
		this.spriteBatch = sb;
		ppuX = 16f;
		ppuY = 16f;
	}
	
	public void render(long elapsedTime){
		this.spriteBatch.begin();
		
		drawLabyrinth();
		
		
		updatePacman(elapsedTime);
		drawPacaman();
		
		this.spriteBatch.end();
	}

	private void updatePacman(long elapsedTime) {
		elapsedTimeSinceLastUpdate += elapsedTime;
		
		if(elapsedTimeSinceLastUpdate > frameDuration) {
			pacmanAnimationState ++;
			elapsedTimeSinceLastUpdate = 0;
			if(pacmanAnimationState >= pacmanAnimationFrames) {
				pacmanAnimationState = 0;
			}
		}		
	}

	private void drawPacaman() {
		
		Pacman pac = world.getPacman();
				
		int frame = 0;
		
		switch(pac.getDirection()) {
		case Down :
			frame = 1 * pacmanAnimationFrames;
			break;
		case Left :
			frame = 2 * pacmanAnimationFrames;
			break;
		case Right :
			frame = 3 * pacmanAnimationFrames;
		case Up :
			frame = 4 * pacmanAnimationFrames;				
		}
		
		TextureRegion text = new TextureRegion(
			TextureFactory.getInstance().getTexture(pac.getClass()),
			(frame + pacmanAnimationState) * pacmanTextureWidth,
			0,
			pacmanTextureWidth,
			pacmanTextureHeight
			);
		
		 
		this.spriteBatch.draw(
				text,
				pac.getY() * ppuX,
				(world.getLabyrinth().getHeight() - pac.getX() - 1) * ppuY,
				pac.getWidth() * ppuX,
				pac.getHeight() * ppuY
		);
	}

	private void drawLabyrinth() {
		for (Element element : this.world.getLabyrinth()) {
			this.spriteBatch.draw(
				TextureFactory.getInstance().getTexture(element.getClass()),
				element.getY() * ppuX,
				(world.getLabyrinth().getHeight() - element.getX() - 1) * ppuY,
				element.getWidth() * ppuX,
				element.getHeight() * ppuY
			);
		}
	}
}