package com.model.elem_creator_cor;

import com.model.*;

public abstract class ElementCreator {
	protected ElementCreator next;
	
	public ElementCreator(ElementCreator next) {
		this.next = next;		
	}
	
	public abstract Element handle(World world, int x, int y, int type);
	
}
