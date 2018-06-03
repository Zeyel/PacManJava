package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.model.Pacman;

public class PacmanRenderer {

	
	private SpriteBatch spriteBatch;
	
	private int pacmanAnimationState = 0;
	private long elapsedTimeSinceLastUpdate = 0;
	private final int pacmanAnimationFrames = 2;
	private final long frameDuration = 200; // in milliseconds
	private final int pacmanTextureHeight = 16;
	private final int pacmanTextureWidth = 16;
	
	public PacmanRenderer(SpriteBatch sb) {
		this.spriteBatch = sb;
	}
	
	public void drawPacman(Pacman pac, float ppuX, float ppuY, int mazeHeight, long elapsedTime) {
			
		updatePacman(elapsedTime);
		
		int frame = 0;
		
		switch(pac.getDirection()) {
		case Down :
			frame = 1 * pacmanAnimationFrames;
			break;
		case Right :
			frame = 2 * pacmanAnimationFrames;
			break;
		case Left :
			frame = 3 * pacmanAnimationFrames;
			break;
		case Up :
			frame = 4 * pacmanAnimationFrames;	
			break;
		default : 
			break;
		}
		
		TextureRegion text = new TextureRegion(
			TextureFactory.getInstance().getTexture(pac.getClass()),
			(frame + pacmanAnimationState) * pacmanTextureWidth,
			0,
			pacmanTextureWidth,
			pacmanTextureHeight);
		
		this.spriteBatch.draw(
				text,
				pac.getY() * ppuX,
				(mazeHeight - pac.getX() - 1) * ppuY,
				pac.getWidth() * ppuX,
				pac.getHeight() * ppuY
		);
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
}
