package com.view;

import com.model.Element;
import com.model.Maze;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazeRenderer {
	
	private SpriteBatch spriteBatch;
	
	public MazeRenderer(SpriteBatch spriteBatch) {
		this.spriteBatch = spriteBatch;
	}
	
	public void drawMaze(Maze maze, float ppuX, float ppuY) {
		for (Element element : maze) {
			this.spriteBatch.draw(
				TextureFactory.getInstance().getTexture(element.getClass()),
				element.getY() * ppuX,
				(maze.getHeight() - element.getX() - 1) * ppuY,
				element.getWidth() * ppuX,
				element.getHeight() * ppuY
			);
		}
	}
	
	
}
