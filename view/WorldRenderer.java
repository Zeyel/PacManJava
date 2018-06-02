package com.view;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.TimeUtils;
import com.model.Element;
import com.model.Pacman;
import com.model.World;

public class WorldRenderer{
	private World world;
	private SpriteBatch spriteBatch;
	private float ppuX;
	private float ppuY;
	
	private MazeRenderer mazeRenderer;
	private PacmanRenderer pacmanRenderer;
		
	public WorldRenderer(World world, SpriteBatch sb){

		this.world = world;
		this.spriteBatch = sb;
		ppuX = 16f;
		ppuY = 16f;
		
		this.mazeRenderer = new MazeRenderer(sb);
		this.pacmanRenderer = new PacmanRenderer(sb);
	}
	
	public void render(long elapsedTime){
		this.spriteBatch.begin();
		
		mazeRenderer.drawMaze(world.getMaze(), ppuX, ppuY);
		pacmanRenderer.drawPacman(world.getPacman(), ppuX, ppuY, world.getHeight(), elapsedTime);
		this.spriteBatch.end();
	}



	
}