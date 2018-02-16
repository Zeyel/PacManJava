package com.pacman.game.view;
import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	private TextureFactory instance = null;
	private  Texture bloc;
	private  ArrayList<Texture> pacman = new ArrayList<Texture>();
	
	// CONSTRUCTEURS
	
	TextureFactory() {
	this.bloc = new Texture("bloc.png");
	this.pacman.add(new Texture("pacman-3.png"));
	this.pacman.add(new Texture("pacmanRight.png"));
	this.pacman.add(new Texture("pacmanRight-2.png"));
	this.pacman.add(new Texture("pacmanLeft.png"));
	this.pacman.add(new Texture("pacmanLeft-2png"));
	this.pacman.add(new Texture("pacmanDown.png"));
	this.pacman.add(new Texture("pacmanDown-2.png"));
	this.pacman.add(new Texture("pacmanUp.png"));
	this.pacman.add(new Texture("pacmanUp-2.png"));
	
	instance = this;
	}
	// GETTERS ET SETTERS
	public static TextureFactory getInstance() {
		if(instance != null){
			return instance;
		}
		return new TextureFactory();
	}
	
	public Texture getBloc() {
		return this.bloc;
	}
	
	public Texture getPacman(int i) {
		return this.pacman.get(i);
	}
	
	// METHODES
	
	
	
}
