package com.view;

import com.model.Element;
import com.model.Maze;
import com.model.Pellet;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazeRenderer {
	
	private SpriteBatch spriteBatch;
	private PelletRenderer pelletRenderer;
	
	public MazeRenderer(SpriteBatch spriteBatch) {
		this.spriteBatch = spriteBatch;
		pelletRenderer = new PelletRenderer(spriteBatch);
	}
	
	public void drawMaze(Maze maze, float ppuX, float ppuY, long elapsedTime) {
		
		pelletRenderer.update(elapsedTime);
		
		for (Element element : maze) {
			
			Pellet pellet = maze.getPellet(element.getX(), element.getY());
			
			if(pellet == null) {				
				this.spriteBatch.draw(
					TextureFactory.getInstance().getTexture(element.getClass()),
					element.getY() * ppuX,
					(maze.getHeight() - element.getX() - 1) * ppuY,
					element.getWidth() * ppuX,
					element.getHeight() * ppuY
				);
			}
			else {
				pelletRenderer.drawPellet(pellet, ppuX, ppuY, maze.getHeight());				
			}
		}
	}
	
	
}
