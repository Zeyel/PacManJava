package com.view;
import java.util.ArrayList;
import java.util.HashMap;
import com.model.Bloc;

import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	
	private HashMap<Class<?>, Texture> textures;
	private static TextureFactory instance = null;
	
	// CONSTRUCTEURS
	
	TextureFactory() {
	
		textures = new HashMap<Class<?>, Texture>();
		
		textures.put(Bloc.class, new Texture("images/bloc.png"));
		//textures.put(Pacman.class, new Texture("pacman.png"));
		//textures.put(Fantom.class, new Texture("fantom.png"));
		//textures.put(Pellet.class, new Texture("pellet.png"));
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
