package com.model.behaviour;

import java.util.Random;

import com.model.Fantom;
import com.model.MovingElement.Direction;
import com.model.Pacman;

public class Randomize extends Behaviour{

	public Randomize(Pacman target, int x, int y) {
		super(target, x, y);
	}

	public Direction choice() {
Direction dir = randomDir();
while (!(getHost().canMove(dir))) {
	dir = randomDir();
	}
return dir;
	}
	
	public Direction randomDir() {
		Random r = new Random();
		int nbr = r.nextInt(4 - 1 + 1) + 1;
		switch (nbr) {
		case 1 :
			return Direction.Up;
		case 2 :
			return Direction.Down;
		case 3 :
			return Direction.Left;
		default :
			return Direction.Right;
		}
	}
}
