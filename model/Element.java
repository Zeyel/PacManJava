package com.model;

import com.badlogic.gdx.graphics.Texture;

public abstract class Element {
	
	private int x;
	private int y;

	private World world;
	
	// GETTERS & SETTERS
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract float getHeight();
	
	public abstract float getWidth();
	
	public void setY(int y) {
		this.y = y;
	}
	
	public World getWorld() {
		return world;
	}
	public void setWorld(World m) {
		this.world = m;
	}
	
	public abstract Texture getTexture();
	
	// CONSTRUCTEURS
	public Element(World m, int x, int y){
		this.world = m;
		this.x = x;
		this.y = y;
	}
	
	
}
