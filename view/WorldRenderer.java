package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.Element;
import com.model.World;

public class WorldRenderer{
	private World world;
	private SpriteBatch spriteBatch;
	private float ppuX;
	private float ppuY;
	
	public WorldRenderer(World world, SpriteBatch sb){
		this.world = world;
		this.spriteBatch = sb;
		ppuX = 16f;
		ppuY = 16f;
	}
	
	public void render(){
		this.spriteBatch.begin();
		for (Element element : this.world.getLabyrinth()) {
			this.spriteBatch.draw(
				TextureFactory.getInstance().getTexture(element.getClass()),
				element.getY() * ppuX,
				(world.getLabyrinth().getHeight() - element.getX() - 1) * ppuY,
				element.getWidth() * ppuX,
				element.getHeight() * ppuY
			);
		}
		this.spriteBatch.end();
	}
}