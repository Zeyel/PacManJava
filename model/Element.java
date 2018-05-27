package com.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class Element {
	
	private int x;
	private int y;

	private Monde m;
	
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
	
	public Monde getMonde() {
		return m;
	}
	public void setMonde(Monde m) {
		this.m = m;
	}
	
	public abstract Texture getTexture();
	
	// CONSTRUCTEURS
	public Element(Monde m, int x, int y){
		this.m = m;
		this.x = x;
		this.y = y;
	}
	
	
}
