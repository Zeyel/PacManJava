package com.pacman.game.model;
import java.util.ArrayList;

public class Labyrinthe {
	private ArrayList<Bloc> maze;
	private int height;
	private int width;
	private Pacman p;

	
	//CONSTRUCTEURS
	
	public Labyrinthe (int h, int w , Pacman p) {
		this.setHeight(h);
		this.setWidth(w);
		this.setPacman(p);
	}
	
	//GETTERS & SETTERS
	public Bloc getMaze(int i) {
		return maze.get(i);
	}

	public void addMaze(Bloc bloc) {
		this.maze.add(bloc);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public Pacman getPacman() {
		return this.p;
	}
	public void setPacman(Pacman p) {
		this.p = p;
	}
}
