package com.pacman.game;
import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
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
	}
	// GETTERS ET SETTERS
	public static TextureFactory getInstance() {
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
