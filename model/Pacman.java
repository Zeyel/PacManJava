package com.model;

import com.badlogic.gdx.graphics.Texture;
import com.view.TextureFactory;

public class Pacman extends Element{
	public Pacman(World w, int x, int y) {
		super(w,x,y);
		// TODO Auto-generated constructor stub
	}

	private static final float taille = 16;

public float getHeight() {
	return taille;
}

public float getWidth() {
	return taille;
}

@Override
public Texture getTexture() {
	return TextureFactory.getInstance().getTexture(this.getClass());//for now
}
}