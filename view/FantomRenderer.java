package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.model.Fantom;

public class FantomRenderer {
	
	private SpriteBatch spriteBatch;
	
	private int fantomAnimationState = 0;
	private long elapsedTimeSinceLastUpdate = 0;
	private final int fantomAnimationFrames = 2;
	private final long frameDuration = 200; // in milliseconds
	private final int fantomTextureHeight = 16;
	private final int fantomTextureWidth = 16;
	
	public FantomRenderer(SpriteBatch sb) {
		this.spriteBatch = sb;
	}
	
	public void drawFantom(Fantom fan, float ppuX, float ppuY, int mazeHeight, long elapsedTime) {
		updateFantom(elapsedTime);
		
		int frame = 0;
		
		switch(fan.getDirection()) {
		case Down :
			frame = 1 * fantomAnimationFrames;
			break;
		case Left :
			frame = 2 * fantomAnimationFrames;
			break;
		case Right :
			frame = 3 * fantomAnimationFrames;
			break;
		case Up :
			frame = 4 * fantomAnimationFrames;	
			break;
		default : 
			break;
		}
		
		TextureRegion text = new TextureRegion(
				TextureFactory.getInstance().getTexture(fan.getClass()),
				(frame + fantomAnimationState) * fantomTextureWidth,
				0,
				fantomTextureWidth,
				fantomTextureHeight);
			
			this.spriteBatch.draw(
					text,
					fan.getY() * ppuX,
					(mazeHeight - fan.getX() - 1) * ppuY,
					fan.getWidth() * ppuX,
					fan.getHeight() * ppuY
			);
	}
	
	public void drawFantom2(Fantom fan, float ppuX, float ppuY, int mazeHeight, long elapsedTime) {
		updateFantom(elapsedTime);
		
		int frame = 0;
		
		switch(fan.getDirection()) {
		case Down :
			frame = 1 * fantomAnimationFrames;
			break;
		case Left :
			frame = 2 * fantomAnimationFrames;
			break;
		case Right :
			frame = 3 * fantomAnimationFrames;
			break;
		case Up :
			frame = 4 * fantomAnimationFrames;	
			break;
		default : 
			break;
		}
		
		TextureRegion text = new TextureRegion(
				TextureFactory.getInstance().getTexture(fan.getClass()),
				(frame + fantomAnimationState) * fantomTextureWidth,
				16,
				fantomTextureWidth,
				fantomTextureHeight);
			
			this.spriteBatch.draw(
					text,
					fan.getY() * ppuX,
					(mazeHeight - fan.getX() - 1) * ppuY,
					fan.getWidth() * ppuX,
					fan.getHeight() * ppuY
			);
	}

	private void updateFantom(long elapsedTime) {
		elapsedTimeSinceLastUpdate += elapsedTime;
		
		if(elapsedTimeSinceLastUpdate > frameDuration) {
			fantomAnimationState ++;
			elapsedTimeSinceLastUpdate = 0;
			if(fantomAnimationState >= fantomAnimationFrames) {
				fantomAnimationState = 0;
			}
		}		
	}
}
