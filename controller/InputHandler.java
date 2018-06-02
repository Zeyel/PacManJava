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

		private final double pauseRatio = 0.8;
		private final float panSensitivity = 4.0f;

		@Override
		public boolean pan(float x, float y, float deltaX, float deltaY) {

			if(Math.abs(deltaX) < panSensitivity & Math.abs(deltaY) < panSensitivity) {
				return true;
			}
			
			if(Math.abs(deltaX) > Math.abs(deltaY)) {
				if(deltaX > 0) {
					moveLeft();
					return true;
				}
				else {
					moveRight();
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
			
			if(x > h * pauseRatio && y > w * pauseRatio) {
				world.pause();
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
	
	public InputHandler(World world) {
		
		this.world = world;
		inputMapping = new HashMap<InputHandler.action, Integer>();
		inputMapping.put(action.goUp, Keys.UP);
		inputMapping.put(action.goDown, Keys.DOWN);
		inputMapping.put(action.goRight, Keys.RIGHT);
		inputMapping.put(action.goLeft, Keys.LEFT);
		inputMapping.put(action.pauseGame, Keys.ESCAPE);

		Gdx.input.setInputProcessor(new GestureDetector(new MyGestureListener()));
		
	}
	
	public void handleInput() {
		handleKeyboard();		
	}
	
	private void handleKeyboard() {
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goUp))){
			moveUp();
			return;
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goDown))){
			moveDown();
			return;
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goRight))){
			moveLeft();
			return;
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goLeft))){
			moveRight();
			return;
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.pauseGame))){
			world.pause();
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
	
}
