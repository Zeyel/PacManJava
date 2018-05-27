package com.model;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.view.TextureFactory;

public class Bloc extends Element{
	private static final float taille= 48;
	
	// CONSTRUCTEURS
	public Bloc( Monde m, int x, int y) {
		super(m,x,y);
	}
	// GETTERS & SETTERS
	
	public float getTaille() {
		return Bloc.taille;
	}
	
	public float getHeight() {
		return Bloc.taille;
	}
	
	public float getWidth() {
		return Bloc.taille;
	}
	
	public Texture getTexture() {
		return TextureFactory.getInstance().getTexture(this.getClass());
	}
	// METHODES
	
}
