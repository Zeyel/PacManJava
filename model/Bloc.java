package com.pacman.game.model;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.pacman.game.view.TextureFactory;

public class Bloc extends Element{
	private static final float taille= 48;
	
	// CONSTRUCTEURS
	public Bloc( Vector2 v, Monde m) {
		super(v);
		this.setMonde(m);
	}
	// GETTERS & SETTERS
	
	public float getTaille() {
		return Bloc.taille;
	}
	public Texture getTexture() {
		return TextureFactory.getInstance().getBloc();
	}
	
	// METHODES
	
}
