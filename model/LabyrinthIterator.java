package com.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LabyrinthIterator implements Iterator<Element> {

	private Labyrinth laby;
	int i;
	int j;
	
	public LabyrinthIterator(Labyrinth labi) {
		this.laby = labi;
		i = j = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		return i < laby.getHeight() && j < laby.getHeight();
	}

	@Override
	public Element next() {
		if(!this.hasNext())
			throw new NoSuchElementException("Plus d'elements");
		
		Element element;
		
		do {
			element = laby.getElement(i, j);
			j = (j+1) % laby.getWidth();
			if(j==0)
				i++;			
		}while(element == null && this.hasNext());
		
		return element;
	}

	
}
