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
		
	public WorldRenderer(World world, SpriteBatch sb){

		this.world = world;
		this.spriteBatch = sb;
		ppuX = 16f;
		ppuY = 16f;
		
		this.mazeRenderer = new MazeRenderer(sb);
		this.pacmanRenderer = new PacmanRenderer(sb);
		this.fantomRenderer = new FantomRenderer(sb);
	}
	
	public void render(long elapsedTime){
		this.spriteBatch.begin();
		
		mazeRenderer.drawMaze(world.getMaze(), ppuX, ppuY);
		pacmanRenderer.drawPacman(world.getPacman(), ppuX, ppuY, world.getHeight(), elapsedTime);
		fantomRenderer.drawFantom(world.getFantom(), ppuX, ppuY, world.getHeight(), elapsedTime);
		this.spriteBatch.end();
	}



	
}