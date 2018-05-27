package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.Element;
import com.model.IterateurLabyrinthe;
import com.model.Monde;

public class WorldRenderer{
	private Monde world;
	private SpriteBatch spriteBatch;
	int ppuX;
	int ppuY;
	
	public WorldRenderer(Monde world, SpriteBatch sb){
		this.world = world;
		this.spriteBatch = sb;
		ppuX = 1;
		ppuY = 1;
	}
	
	public void render(){
		this.spriteBatch.begin();
		for (Element element : this.world.getLabyrinthe()) {//TODO ppux
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