package com.pacman.game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Bloc extends Element{
	private static final float taille= 48;
	
	// CONSTRUCTEURS
	public Bloc( Vector2 v, Monde m) {
		this.setV(v);
		this.setM(m);
	}
	// GETTERS & SETTERS
	
	public float getTaille() {
		return Bloc.taille;
	}
	public Texture getText() {
		return TextureFactory.getInstance().getBloc();
	}
	
	// METHODES
	
}
