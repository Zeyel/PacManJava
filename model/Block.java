package com.model;
import com.badlogic.gdx.graphics.Texture;
import com.view.TextureFactory;

public class Block extends Element{
	private static final float size= 32;
	
	// CONSTRUCTEURS
	public Block( World m, int x, int y) {
		super(m,x,y);
	}
	// GETTERS & SETTERS
	
	public float getTaille() {
		return Block.size;
	}
	
	public float getHeight() {
		return Block.size;
	}
	
	public float getWidth() {
		return Block.size;
	}
	
	public Texture getTexture() {
		return TextureFactory.getInstance().getTexture(this.getClass());
	}
	// METHODES
	
}
