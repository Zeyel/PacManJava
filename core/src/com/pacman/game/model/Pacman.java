package com.pacman.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.pacman.game.view.TextureFactory;

public class Pacman extends Element{
	private static final float taille = 16;

public float getTaille() {
	return taille;
}

public Texture getText() {
	return TextureFactory.getInstance().getPacman(0);
}
}