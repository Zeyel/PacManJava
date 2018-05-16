package com.model;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.view.TextureFactory;

public class Bloc extends Element{
	private static final float taille= 48;
	private int type;
	
	// CONSTRUCTEURS
	public Bloc( Monde m, int x, int y, int type) {
		super(m,x,y);
		this.type = type;
	}
	// GETTERS & SETTERS
	
	public float getTaille() {
		return Bloc.taille;
	}
	public Texture getTexture() {
		return TextureFactory.getInstance().getBloc();
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	// METHODES
	
}
