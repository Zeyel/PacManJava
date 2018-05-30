package com.model;

import com.badlogic.gdx.graphics.Texture;
import com.view.TextureFactory;

public abstract class Element {
	
	private int x;
	private int y;

	private World world;
	
	// GETTERS & SETTERS
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract float getHeight();
	
	public abstract float getWidth();
	
	public void setY(int y) {
		this.y = y;
	}
	
	public World getWorld() {
		return world;
	}
	public void setWorld(World m) {
		this.world = m;
	}
	
	// CONSTRUCTEURS
	public Element(World m, int x, int y){
		this.world = m;
		this.x = x;
		this.y = y;
	}
	
	public Texture getTexture() {
		return TextureFactory.getInstance().getTexture(this.getClass());
	}
	
	public boolean move(int x, int y) {		// Return true if the Element doesn't encounter a wall, 
		// has to be modified for Pacman who can't pass FantomWall
		// (1 , 0) pour droite, (0 , 1) pour haut, (-1 , 0) pour gauche, (0 , -1) pour bas
		Element wall = new Wall(this.getWorld(), this.getX()+x, this.getY()+y);
		if (getWorld().getLabyrinth().getElement(this.getX()+x, this.getY()+y) != wall) {		// J'sais pas comment teste si getElement est de la classe Wall
			if (this.getX()+x >= this.getWorld().getWidth())			// Si on part hors du décor à droite
				this.setX(0);
			else if (this.getX()+ x < 0)											// Si on part hors du décor à gauche
				this.setX(this.getWorld().getWidth()-1);
			else if (this.getY()+y >= this.getWorld().getHeight())	// Si on part hors du décor en haut
				this.setY(0);
			else if (this.getY()+ y < 0)											// Si on part hors du décor en bas
				this.setY(this.getWorld().getHeight()-1);
			else {																		// Si y a pas de problèmes
					this.setX(this.getX()+x);
					this.setY(this.getY()+y);
			} 
			return true;
		} else
			return false; 		// Si non possible, on continue la boucle en dehors pour trouver une direction atteignable
			
		
	}
}
