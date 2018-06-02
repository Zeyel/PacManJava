package com.controller;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.model.World;
import com.model.MovingElement;

public class InputHandler {

	public enum action{
		goUp, goDown, goLeft, goRight, pauseGame
	}
	
	
	public World world;
	public HashMap<action, Integer> inputMapping;

	public InputHandler(World world) {
		
		this.world = world;
		inputMapping = new HashMap<InputHandler.action, Integer>();
		inputMapping.put(action.goUp, Keys.UP);
		inputMapping.put(action.goDown, Keys.DOWN);
		inputMapping.put(action.goRight, Keys.RIGHT);
		inputMapping.put(action.goLeft, Keys.LEFT);
		inputMapping.put(action.pauseGame, Keys.ESCAPE);
		
	}
	
	public void handleInput() {
		handleKeyboard();		
	}
	
	private void handleKeyboard() {
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goUp))){
			world.getPacman().setDirection(MovingElement.Direction.Up);
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goDown))){
			world.getPacman().setDirection(MovingElement.Direction.Down);
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goRight))){
			world.getPacman().setDirection(MovingElement.Direction.Right);
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.goLeft))){
			world.getPacman().setDirection(MovingElement.Direction.Left);
		}
		
		if(Gdx.input.isKeyPressed(inputMapping.get(action.pauseGame))){
			//TODO PAUSE THE GAME
		}
	}
	
}
