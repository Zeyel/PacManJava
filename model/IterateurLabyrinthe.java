package com.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterateurLabyrinthe implements Iterator<Element> {

	private Labyrinthe labi;
	int i;
	int j;
	
	public IterateurLabyrinthe(Labyrinthe labi) {
		this.labi = labi;
		i = j = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		return i < labi.getHeight() && j < labi.getHeight();
	}

	@Override
	public Element next() {
		if(!this.hasNext())
			throw new NoSuchElementException("Plus d'elements");
		
		Element element;
		
		do {
			element = labi.getElement(i, j);
			j = (j+1) % labi.getWidth();
			if(j==0)
				i++;			
		}while(element == null && this.hasNext());
		
		return element;
	}

	
}
