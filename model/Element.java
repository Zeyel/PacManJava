package com.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class Element {
	
	private Vector2 v;
	private Monde m;
	
	// GETTERS & SETTERS
	public Vector2 getPosition() {
		return v;
	}
	public void setPosition(Vector2 v) {
		this.v = v;
	}
	public Monde getMonde() {
		return m;
	}
	public void setMonde(Monde m) {
		this.m = m;
	}
	
	public abstract Texture getTexture();
	
	// CONSTRUCTEURS
	public Element(Vector2 vecteur){
		v = vecteur;
	}
	
	
}
