package com.view;
import java.util.HashMap;
import com.model.*;

import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	
	private HashMap<Class<?>, Texture> textures;
	private static TextureFactory instance = null;
	
	// CONSTRUCTEURS
	
	TextureFactory() {
	
		textures = new HashMap<Class<?>, Texture>();
		
		Texture empty = new Texture("images/dark.png");
		
		textures.put(Wall.class, new Texture("images/bloc.png"));
		textures.put(Crossing.class, empty);
		textures.put(Path.class, empty);
		textures.put(FantomWall.class, empty);
		textures.put(Pacman.class, new Texture("images/pacman.png"));
		textures.put(Fantom.class, new Texture("images/ghost1.png"));
		textures.put(Pellet.class, new Texture("images/pellet.png"));
		//textures.put(SuperPellet.class, new Texture("super_pellet.png"));
		
		instance = this;
	}
	// GETTERS ET SETTERS
	public static TextureFactory getInstance() {
		if(instance == null){
			instance = new TextureFactory();
		}
		return instance;
	}
	
	// METHODES
	public Texture getTexture(Class<?> c) {
		return textures.get(c);
	}
	
}
