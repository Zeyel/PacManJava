package com.pacman.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pacman.game.pacman.MonPacman;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 800;
		config.height = 600;
		config.fullscreen = false;
		config.resizable = false;
		config.title = "M0n P4cm4n l0l";
		new LwjglApplication(new MonPacman(), config);
	}
}
