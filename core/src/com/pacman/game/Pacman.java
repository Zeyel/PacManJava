package com.pacman.game;

import com.badlogic.gdx.graphics.Texture;

public class Pacman extends Element{
	private static final float taille = 16;

public float getTaille() {
	return taille;
}

public Texture getText() {
	return TextureFactory.getInstance().getPacman(0);
}
}