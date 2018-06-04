package com.model;

import com.model.behaviour.*;

public class World {
	private Maze lab;
	private Pacman pacman;
	private Fantom fantom;
	private Fantom fantom2;
	private Fantom fantom3;
	private Fantom fantom4;
	
	static public final int nothing = 0;
	static public final int pacgom = 1;
	static public final int superPacgom = 1;
	
	private int score = 0;
	private boolean paused = false;
	private long lastUpdate = 0;
	private final long updateRate = 200; //en ms
	private long timer = 0;
	
	// CONSTRUCTEURS
	
	public World(Maze lab) {
		this.setLabyrinth(lab);
		pacman = new Pacman(this, 1,1);
		Behaviour random = new Randomize(pacman, 12, 12);
		Behaviour minimize = new Minimize(pacman, 13, 12);
		Behaviour minimize2 = new Minimize(pacman, 14, 12);
		Behaviour random2 = new Randomize(pacman, 15, 12);
		fantom = new Fantom(this, 13, 12, minimize);
		fantom2 = new Fantom(this, 13, 14, random);
		fantom3 = new Fantom(this, 14, 12, minimize2);
		fantom4= new Fantom(this, 15, 12, random2);
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
	
	public Fantom getFantom2() {
		return fantom2;
	}
	
	public Fantom getFantom3() {
		return fantom3;
	}
	
	public Fantom getFantom4() {
		return fantom4;
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
	
	public void augmentScore(){
		score++;
	}
	
	public void update(long elapsedTime) {
		
		if(paused)
			return;
		
		lastUpdate += elapsedTime;
		
		if(lastUpdate > updateRate) {
			if (this.timer > 0) {
				pacman.move();
				pacman.eat();
				fantom.flee();
				fantom2.flee();
				fantom3.flee();
				fantom4.flee();
				fantom.move();
				fantom2.move();
				fantom3.move();
				fantom4.move();
				this.timer = this.timer - this.updateRate;
			} else {
			pacman.move();
			pacman.eat();
			fantom.update();
			fantom2.update();
			fantom3.update();
			fantom4.update();
			fantom.move();
			fantom2.move();
			fantom3.move();
			fantom4.move();
			}
			
		if(
			samePos(pacman, fantom)||
			samePos(pacman, fantom2)||
			samePos(pacman, fantom3)||
			samePos(pacman, fantom4)) {
			
				//TODO fin de partie
				System.out.println("You lost");
			}
			
			
			
			lastUpdate = 0;
		}		
	}

	private boolean samePos(Element pacman, Element fantom) {
		return pacman.getX() == fantom.getX() && fantom.getY() == pacman.getY();
	}
	
	public void superPelletEaten() {
		this.timer = 10000;
		
	}

	public int getScore() {
		return score;
	}

	// METHODES
}
