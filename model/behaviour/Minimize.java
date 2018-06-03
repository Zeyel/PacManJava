package com.model.behaviour;

import com.model.MovingElement.Direction;
import com.model.Pacman;

public class Minimize extends Behaviour{

	public Minimize(Pacman target, int x, int y) {
		super(target, x, y);
	}

	@Override
	public Direction choice() {
		int diffX = this.getX() - this.getHost().getX();
		int diffY = this.getY() - this.getHost().getY();
		
		if (this.getHost().canMove(higher(diffX, diffY)))
			return higher(diffX, diffY);
		else if (this.getHost().canMove(second(diffX, diffY)))
			return second(diffX, diffY);
		else if (this.getHost().canMove(third(diffX, diffY)))
			return third(diffX, diffY);
		else
			return lower(diffX, diffY);
			
	}
	
	public Direction higher(int diffX, int diffY) {
		if (Math.abs(diffX) < Math.abs(diffY)) {
			if (diffY < 0)
				return Direction.Up;		
			else
				return Direction.Down;
	} else
		if (diffX < 0)
			return Direction.Left;
		else
			return Direction.Right;
	}

	public Direction second(int diffX, int diffY) {
		if (Math.abs(diffX) < Math.abs(diffY)) {
			if (diffX < 0)
				return Direction.Left;		
			else
				return Direction.Right;
	} else
		if (diffX < 0)
			return Direction.Up;
		else
			return Direction.Down;
	}
	
	public Direction third(int diffX, int diffY) {
		if (Math.abs(diffX) < Math.abs(diffY)) {
			if (-diffX < 0)
				return Direction.Left;		
			else
				return Direction.Right;
	} else
		if (-diffX < 0)
			return Direction.Up;
		else
			return Direction.Down;
	}
	public Direction lower(int diffX, int diffY) {
		if (Math.abs(diffX) < Math.abs(diffY)) {
			if (-diffY < 0)
				return Direction.Up;		
			else
				return Direction.Down;
	} else
		if (-diffX < 0)
			return Direction.Left;
		else
			return Direction.Right;
	}
}
