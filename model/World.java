package com.model;

public class World {
	private Labyrinth lab;
	private Pacman pacman;
	
	// CONSTRUCTEURS
	
	public World(Labyrinth lab) {
		this.setLabyrinth(lab);
		pacman = new Pacman(this, 1,1);
	}
	// GETTERS & SETTERS

	public Labyrinth getLabyrinth() {
		return lab;
	}

	public void setLabyrinth(Labyrinth lab) {
		this.lab = lab;
	}

	public Pacman getPacman(){
		return pacman;
	}
	
	public void setPacman(Pacman pac){
		pacman = pac;
	}
	
	public int getHeight(){
		return lab.getHeight();
	}
	
	public int getWidth(){
		return lab.getWidth();
	}

	// METHODES
}
