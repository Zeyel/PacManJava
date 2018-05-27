package com.model;

public class Pacman extends Element{
	
	public enum Direction{ Up,Down,Left,Right, None }
	
	private Direction direction = Direction.Right;
	
	public Pacman(World w, int x, int y) {
		super(w,x,y);
	}

	private static final float taille = 1f;
	
	public float getHeight() {
		return taille;
	}
	
	public float getWidth() {
		return taille;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction dir) {
		direction = dir;
	}
	
	// methods
	
	
	
	

}