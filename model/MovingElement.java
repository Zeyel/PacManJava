package com.model;

public abstract class MovingElement extends Element {

	private Direction direction;
	
	public MovingElement(World m, int x, int y) {
		super(m, x, y);
		direction = Direction.None;
	}

	public enum Direction{ Up,Down,Left,Right, None }
		
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction dir) {
		direction = dir;
	}
	
	public abstract float getHeight();

	@Override
	public abstract float getWidth();
	
	public abstract boolean canMove(Direction direction);
	
	public void move() {
		if(canMove(direction)) {
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
			this.setX(x);
			this.setY(y);
			
		}
		else {
			direction = Direction.None;
		}
	}
	
}
