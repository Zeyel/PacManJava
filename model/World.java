package com.model;

public class World {
	private Maze lab;
	private Pacman pacman;
	
	private long lastUpdate = 0;
	private final long updateRate = 200; //en ms
	
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
	
	public void update(long elapsedTime) {
		
		lastUpdate += elapsedTime;
		
		if(lastUpdate > updateRate) {
			pacman.move();
			lastUpdate = 0;
		}		
	}

	// METHODES
}
