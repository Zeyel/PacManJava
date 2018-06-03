package com.model;

import com.model.behaviour.*;

public class World {
	private Maze lab;
	private Pacman pacman;
	private Fantom fantom;
	
	private boolean paused = false;
	private long lastUpdate = 0;
	private final long updateRate = 200; //en ms
	
	// CONSTRUCTEURS
	
	public World(Maze lab) {
		this.setLabyrinth(lab);
		pacman = new Pacman(this, 1,1);
		
		Random behaviour = new Random();
		fantom = new Fantom(this, 13, 12, behaviour);
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
	
	public Fantom getFantom() {
		return fantom;
	}
	
	public void setFantom(Fantom fan) {
		fantom = fan;
	}
	
	public int getHeight(){
		return lab.getHeight();
	}
	
	public int getWidth(){
		return lab.getWidth();
	}
	
	public boolean isPaused() {
		return paused;
	}
	
	public void pause() {
		paused = !paused;
	}
	
	public void update(long elapsedTime) {
		
		if(paused)
			return;
		
		lastUpdate += elapsedTime;
		
		if(lastUpdate > updateRate) {
			pacman.move();
			lastUpdate = 0;
		}		
	}

	// METHODES
}
