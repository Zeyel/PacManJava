package com.model.behaviour;

import com.model.Fantom;
import com.model.MovingElement.Direction;
import com.model.Pacman;

public class Minimize extends Behaviour{

	public Minimize(Fantom host, Pacman target, int x, int y) {
		super(host, target, x, y);
	}

	@Override
	public Direction choice() {
		int diffX = this.getX() - this.getHost().getX();
		int diffY = this.getY() - this.getHost().getY();
		
		return Direction.None;
	}
}
