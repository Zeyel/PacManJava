package com.model;

public class Pacman extends MovingElement{
	
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
			y--;
			break;
		case Left :
			y++;
			break;
		default:
			break;
		}
		
		World world = this.getWorld();
		
		if(x >= world.getHeight() || y >= world.getWidth() || x < 0 || y < 0 ){
		   return false;
	   }
		
		int type = world.getMaze().getLabyElem(x, y);
		
		return ((type != Maze.block) && (type != Maze.fantomWall)) ;
	}

	
	public void eat() {
		
		Pellet pellet = this.getWorld().getMaze().getPellet(this.getX(), this.getY());
		
		if(! pellet.isConsumed()) {
			pellet.consume();
			if (pellet.isSuperPellet()) {
				this.getWorld().superPelletEaten();
			}
			this.getWorld().augmentScore();
		}
		
	}
	
}