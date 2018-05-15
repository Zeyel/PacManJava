package com.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.view.TextureFactory;

public class Pacman extends Element{
	public Pacman(Vector2 vecteur) {
		super(vecteur);
		// TODO Auto-generated constructor stub
	}

	private static final float taille = 16;

public float getTaille() {
	return taille;
}

public Texture getText() {
	return TextureFactory.getInstance().getPacman(0);
}

@Override
public Texture getTexture() {
	// TODO Auto-generated method stub
	return null;
}
}