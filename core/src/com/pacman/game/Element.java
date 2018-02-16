package com.pacman.game;

import com.badlogic.gdx.math.Vector2;

public abstract class Element {
	private Vector2 v;
	private Monde m;
	// GETTERS & SETTERS
	public Vector2 getV() {
		return v;
	}
	public void setV(Vector2 v) {
		this.v = v;
	}
	public Monde getM() {
		return m;
	}
	public void setM(Monde m) {
		this.m = m;
	}
}
