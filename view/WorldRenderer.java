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
	
	private MazeRenderer mazeRenderer;
	private MovingElementRenderer pacmanRenderer;
	
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
		
		this.mazeRenderer = new MazeRenderer(sb);
		
	}
	
	public void render(long elapsedTime){
		this.spriteBatch.begin();
		
		mazeRenderer.drawMaze(world.getMaze(), ppuX, ppuY);
		
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
				(world.getMaze().getHeight() - pac.getX() - 1) * ppuY,
				pac.getWidth() * ppuX,
				pac.getHeight() * ppuY
		);
	}

}