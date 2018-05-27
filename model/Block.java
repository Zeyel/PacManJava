package com.model;

public class Block extends Element{
	public static final float size= 1f;
	
	// CONSTRUCTEURS
	public Block( World m, int x, int y) {
		super(m,x,y);
	}
	// GETTERS & SETTERS
	
	public float getHeight() {
		return Block.size;
	}
	
	public float getWidth() {
		return Block.size;
	}
}
