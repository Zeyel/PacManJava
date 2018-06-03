package com.controller;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.model.World;
import com.model.MovingElement;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

public class InputHandler {

	private class MyGestureListener  implements GestureListener{

		private final double pauseRatio = 0.0606060606;
		private final float panSensitivity = 4.0f;

		@Override
		public boolean pan(float x, float y, float deltaX, float deltaY) {

			if(Math.abs(deltaX) < panSensitivity & Math.abs(deltaY) < panSensitivity) {
				return true;
			}
			
			if(Math.abs(deltaX) > Math.abs(deltaY)) {
				if(deltaX > 0) {
					moveRight();
					return true;
				}
				else {
					moveLeft();
					return true;
				}
			}
			else {
				if(deltaY > 0) {
					moveDown();
					return true;
				}
				else {
					moveUp();
					return true;
				}
			}
		}
		
		@Override
		public boolean tap(float x, float y, int count, int button) {
			int w = Gdx.graphics.getWidth();
			int h = Gdx.graphics.getHeight();
			//  
			if(y < h * pauseRatio && x > w * (1-pauseRatio)) {
				pauseWorld();
				return true;
			}
			
			return false;
		}
		
		//Unused methods
		
		@Override
		public boolean touchDown(float x, float y, int pointer, int button) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean longPress(float x, float y) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean fling(float velocityX, float velocityY, int button) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean panStop(float x, float y, int pointer, int button) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean zoom(float initialDistance, float distance) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void pinchStop() {
			// TODO Auto-generated method stub
			
		}
		
		
	};	
	
	public enum action{
		goUp, goDown, goLeft, goRight, pauseGame
	}
		
	private World world;
	private HashMap<action, Integer> inputMapping;
	private HashMap<action, Boolean> pressed;
	
	public InputHandler(World world) {
		
		this.world = world;
		inputMapping = new HashMap<InputHandler.action, Integer>();
		inputMapping.put(action.goUp, Keys.UP);
		inputMapping.put(action.goDown, Keys.DOWN);
		inputMapping.put(action.goRight, Keys.RIGHT);
		inputMapping.put(action.goLeft, Keys.LEFT);
		inputMapping.put(action.pauseGame, Keys.ESCAPE);
		
		pressed = new HashMap<action, Boolean>();
		pressed.put(action.goUp, false);
		pressed.put(action.goDown, false);
		pressed.put(action.goRight, false);
		pressed.put(action.goLeft, false);
		pressed.put(action.pauseGame, false);
		
		Gdx.input.setInputProcessor(new GestureDetector(new MyGestureListener()));
		
	}
	
	public void handleInput() {
		handleKeyboard();		
	}
	
	private void handleKeyboard() {
		
		for(action act : inputMapping.keySet()) {
			if(Gdx.input.isKeyPressed(inputMapping.get(act))) {				
				if(! pressed.get(act)) {			
					perform(act);
					pressed.put(act,true);
				}				
			}
			else {
				pressed.put(act,false);
			}			
		}
	}
	
	
	private void perform(action act) {
		switch(act) {
		case goUp:
			moveUp();
			break;
		case goDown:
			moveDown();
			break;
		case goLeft :
			moveLeft();
			break;
		case goRight :
			moveRight();
			break;
		case pauseGame :
		pauseWorld();
			break;		
		}
		
	}

	private void moveUp() {
		world.getPacman().setDirection(MovingElement.Direction.Up);
	}
	
	private void moveDown() {
		world.getPacman().setDirection(MovingElement.Direction.Down);
	}
	
	private  void moveLeft() {
		world.getPacman().setDirection(MovingElement.Direction.Right);
	}
	
	private void moveRight() {
		world.getPacman().setDirection(MovingElement.Direction.Left);
	}
	
	private void pauseWorld() {
		world.pause();
	}
	
}
