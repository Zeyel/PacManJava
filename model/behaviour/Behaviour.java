package com.model.behaviour;

import com.model.Fantom;
import com.model.MovingElement.Direction;
import com.model.Pacman;

public abstract class Behaviour {
public int xHome;
public int yHome;
private Fantom host;
private Pacman target;
private int x;
private int y;

	public Behaviour(Pacman target, int x, int y) {
		this.target = target;
		this.x = target.getX();
		this.y = target.getY();
		this.xHome = x;
		this.yHome = y;
	}
	
	public void setHost(Fantom fantom) {
		this.host = fantom;
	}
	
	public Fantom getHost() {
		return this.host;
	}
	public int getX() {
		return this.x;
	}
	public void setTarget() {
		this.x = target.getX();
		this.y = target.getY();
	}
	
	public int getY() {
		return this.y;
	}
	
	public abstract Direction choice();
	public void dying() {
		this.x = this.xHome;
		this.y = this.yHome;
	}
	
	public void revive() {
		this.x = this.target.getX();
		this.y = this.target.getY();
	}
	
	public void flee() {
		this.x = this.target.getX()+this.host.getX();
		this.y = this.target.getY()+this.host.getY();
	}
	
}
