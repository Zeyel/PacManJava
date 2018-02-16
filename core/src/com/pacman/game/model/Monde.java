package com.pacman.game.model;

public class Monde {
	private Labyrinthe lab;
	
	// CONSTRUCTEURS
	
	public Monde(Labyrinthe lab) {
		this.setLab(lab);
	}
	// GETTERS & SETTERS


	public Labyrinthe getLab() {
		return lab;
	}

	public void setLab(Labyrinthe lab) {
		this.lab = lab;
	}

	
	// METHODES
}
