package com.pacman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.TimeUtils;
import com.model.Labyrinth;
import com.model.World;
import com.view.*;

public class MonPacman extends ApplicationAdapter {
	
	private long time;
	private GameScreen screen;
	private World world;
	
	@Override
	public void create () {
		world = new World(new Labyrinth(world));
		screen = new GameScreen(world);
		time = TimeUtils.millis();
	}

	@Override
	public void render () {
		screen.render(TimeUtils.timeSinceMillis(time));
		time = TimeUtils.millis();
	}
	
	@Override
	public void dispose () {
	}
}
