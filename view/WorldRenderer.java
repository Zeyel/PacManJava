package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.Element;
import com.model.World;

public class WorldRenderer{
	private World world;
	private SpriteBatch spriteBatch;
	int ppuX;
	int ppuY;
	
	public WorldRenderer(World world, SpriteBatch sb){
		this.world = world;
		this.spriteBatch = sb;
		ppuX = 1;
		ppuY = 1;
	}
	
	public void render(){
		this.spriteBatch.begin();
		for (Element element : this.world.getLabyrinth()) {//TODO ppux
			this.spriteBatch.draw(
				TextureFactory.getInstance().getTexture(element.getClass()),
				element.getX() * 32,
				element.getY() * 32,
				element.getWidth() * ppuX,
				element.getHeight() * ppuY
			);
		}
		this.spriteBatch.end();
	}
}