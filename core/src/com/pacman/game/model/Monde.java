package com.pacman.game.model;

public class Monde {
	private Labyrinthe lab;
	private Pacman pacman;
	
	// CONSTRUCTEURS
	public Monde(){
		//TODO
	}
	
	public Monde(Labyrinthe lab) {
		this.setLab(lab);
	}
	// GETTERS & SETTERS

	public Labyrinthe getLabyrinthe() {
		return lab;
	}

	public void setLabyrinthe(Labyrinthe lab) {
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
	
	public iterator<Element> iterator(){
		return lab.iterator();
	}
	// METHODES
}
