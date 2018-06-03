package com.model.behaviour;

import com.model.Pacman;

public abstract class Behaviour {
private Pacman target;
private int x;
private int y;

	public Behaviour(Pacman target, int x, int y) {
		this.target = target;
		this.x = x;
		this.y = y;
	}
	public abstract int choice();
	public int flee() {
		
	}
	
}
