package com.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.view.TextureFactory;

public class WorldRenderer{
	private Monde world;
	private SpriteBatch spriteBatch;
	int ppuX;
	int ppuY;
	
	WorldRenderer(Monde world){
		this.world = world;
	}
	
	void render(){
		this.spriteBatch.begin();
		for (Element element : this.world) {
			TextureFactory.getInstance().getTexture(Element.getClass()),
				element.getX() * ppuX,
				element.getY() * ppuY
		//		element.getWidth() * ppuX,
		//		element.getHeight() * ppuY
				);
		}
		this.spriteBatch.end();
	}
}