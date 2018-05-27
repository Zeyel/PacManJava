package com.model;

public class Block extends Element{
	private static final int size= 32;
	
	// CONSTRUCTEURS
	public Block( World m, int x, int y) {
		super(m,x*size,y*size);
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
}
