package com.pacman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.*;
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
