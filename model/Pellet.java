package com.model;

public class Pellet extends Block {

	private boolean consumed = false;
	private boolean superPellet = false;
	
	public Pellet(World m, int x, int y) {
		super(m, x, y);
	}

	public void consume() {
		consumed = true;
	}
	
	public void reset() {
		consumed = false;
	}
	
	public void setSuper() {
		superPellet = true;
	}
	
	public boolean isConsumed() {
		return consumed;
	}
	
	public boolean isSuperPellet() {
		return superPellet;
	}
	

}
