package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.model.World;

public class WorldRenderer{
	private World world;
	private SpriteBatch spriteBatch;
	private float ppuX;
	private float ppuY;
	
	private MazeRenderer mazeRenderer;
	private PacmanRenderer pacmanRenderer;
	private FantomRenderer fantomRenderer;
	private FantomRenderer fantom2Renderer;
		
	public WorldRenderer(World world, SpriteBatch sb){

		this.world = world;
		this.spriteBatch = sb;
		ppuX = 16f;
		ppuY = 16f;
		
		this.mazeRenderer = new MazeRenderer(sb);
		this.pacmanRenderer = new PacmanRenderer(sb);
		this.fantomRenderer = new FantomRenderer(sb);
		this.fantom2Renderer = new FantomRenderer(sb);
	}
	
	public void render(long elapsedTime){
		
		if(world.isPaused())
			elapsedTime = 0;
		
		this.spriteBatch.begin();
		mazeRenderer.drawMaze(world.getMaze(), ppuX, ppuY, elapsedTime);
		pacmanRenderer.drawPacman(world.getPacman(), ppuX, ppuY, world.getHeight(), elapsedTime);
		fantomRenderer.drawFantom(world.getFantom(), ppuX, ppuY, world.getHeight(), elapsedTime);
		fantom2Renderer.drawFantom2(world.getFantom2(), ppuX, ppuY, world.getHeight(), elapsedTime);
		this.spriteBatch.end();
		
	}

	public float getPpuX() {
		return ppuX;
	}

	public float getPpuY() {
		return ppuY;
	}
	
}