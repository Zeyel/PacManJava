package com.pacman.game.view;
import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	private static TextureFactory instance = null;
	private  Texture bloc;
	private  ArrayList<Texture> pacman = new ArrayList<Texture>();
	private Texture vide;
	private ArrayList<Texture> fantoms = new ArrayList<Texture>();
	private ArrayList<Texture> pellets;
	
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
	this.vide = new Texture("dark.png");
	this.fantoms.add(new Texture("ghost1.png"));
	this.fantoms.add(new Texture("ghost2.png"));
	this.fantoms.add(new Texture("ghost3.png"));
	this.fantoms.add(new Texture("ghostDead.png"));
	this.fantoms.add(new Texture("ghostEscaping.png"));
	this.pellets.add(new Texture("pellet.png"));
	this.pellets.add(new Texture("superpellet.png"));
	this.pellets.add(new Texture("superpellet2.png"));
	
	instance = this;
	}
	// GETTERS ET SETTERS
	public static TextureFactory getInstance() {
		if(instance == null){
			instance = new TextureFactory();
		}
		return instance;
	}
	
	public Texture getBloc() {
		return this.bloc;
	}
	
	public Texture getPacman(int i) {
		return this.pacman.get(i);
	}
	
	// METHODES
	
	
	
}
