package com.model;

public class World {
	private Maze lab;
	private Pacman pacman;
	
	// CONSTRUCTEURS
	
	public World(Maze lab) {
		this.setLabyrinth(lab);
		pacman = new Pacman(this, 1,1);
	}
	// GETTERS & SETTERS

	public Maze getMaze() {
		return lab;
	}

	public void setLabyrinth(Maze lab) {
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
	
	public void update() {
		pacman.move();		
	}

	// METHODES
}
