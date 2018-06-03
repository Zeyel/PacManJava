package com.model;

import com.model.behaviour.*;

public class Fantom extends MovingElement{
	private Behaviour behaviour;
	private int state;
	private static final float taille = 1f;
	
	static public final int alive = 0;
	static public final int dead = 1;
	static public final int scared = 2;

	public Fantom(World w, int x, int y, Behaviour behaviour) {
		super(w,x,y);
		setBehaviour(behaviour);
		setState(0);
	}


	public float getHeight() {
		return taille;
	}

	public float getWidth() {
		return taille;
	}
	
	public Behaviour getBehaviour() {
		return this.behaviour;
	}
	
	public int state(){
		return this.state;
	}
	
	public void setBehaviour(Behaviour behaviour){
		this.behaviour = behaviour;
	}
	
	public void setState(int i){
		this.state = i;
	}

	public boolean canMove(Direction direction) {
		
		int x = this.getX();
		int y = this.getY();
		
		switch(direction) {
		case Up :
			x--;
			break;
		case Down :
			x++;
			break;
		case Right :
			y++;
			break;
		case Left :
			y--;
			break;
		default:
			break;
		}
		
		World world = this.getWorld();
		
		if(x >= world.getHeight() || y >= world.getWidth() || x < 0 || y < 0 ){
		   return false;
	   }
		
		int type = world.getMaze().getLabyElem(x, y);
		
		return type != Maze.block;
	}
}
