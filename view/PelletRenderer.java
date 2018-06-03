package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.model.Pellet;

public class PelletRenderer {

private SpriteBatch spriteBatch;
	
	private int pelletAnimationState = 0;
	private long elapsedTimeSinceLastUpdate = 0;
	private final int pelletsAnimationFrames = 2;
	private final long frameDuration = 500; // in milliseconds
	private final int pelletTextureHeight = 16;
	private final int pelletTextureWidth = 16;
	
	public PelletRenderer(SpriteBatch sb) {
		this.spriteBatch = sb;
	}
	
	public void drawPellet(Pellet pellet, float ppuX, float ppuY, int mazeHeight) {

		int frame = 0;
		
		if(pellet.isSuperPellet()) {
			frame = 1 * pelletsAnimationFrames;
		}
		
		TextureRegion text = new TextureRegion(
				TextureFactory.getInstance().getTexture(pellet.getClass()),
				(frame + pelletAnimationState) * pelletTextureWidth,
				0,
				pelletTextureWidth,
				pelletTextureHeight);
		
		this.spriteBatch.draw(
				text,
				pellet.getY() * ppuX,
				(mazeHeight - pellet.getX() - 1) * ppuY,
				pellet.getWidth() * ppuX,
				pellet.getHeight() * ppuY
		);
		
	}
	
	public void update(long elapsedTime) {
		elapsedTimeSinceLastUpdate += elapsedTime;
		
		if(elapsedTimeSinceLastUpdate > frameDuration) {
			pelletAnimationState ++;
			elapsedTimeSinceLastUpdate = 0;
			if(pelletAnimationState >= pelletsAnimationFrames) {
				pelletAnimationState = 0;
			}
		}		
	}

}
