package com.model;
import java.util.ArrayList;
import java.util.Iterator;

public class Labyrinthe {
	private ArrayList<Bloc> maze;
	private int height;
	private int width;
	private Iterator<Element> gameElement;
	
	//CONSTRUCTEURS
	
	public Labyrinthe (int h, int w) {
		this.setHeight(h);
		this.setWidth(w);
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
}
