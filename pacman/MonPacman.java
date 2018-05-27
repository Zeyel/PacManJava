package com.pacman;

import com.badlogic.gdx.ApplicationAdapter;
import com.view.*;

public class MonPacman extends ApplicationAdapter {
	GameScreen screen;
	
	@Override
	public void create () {
		screen = new GameScreen();
	}

	@Override
	public void render () {
		screen.render(0f);
	}
	
	@Override
	public void dispose () {
	}
}
