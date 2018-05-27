package com.model.elem_creator_cor;

import com.model.*;

public class ElementCreatorWall extends ElementCreator {

	public ElementCreatorWall(ElementCreator next) {
		super(next);
	}
	
	@Override
	public Element handle(World world, int x, int y, int type) {
		
		if(type != 0) {
			return next != null ? next.handle(world, x, y, type) : null;
		}
		
		return new Wall(world,x,y);
	}
	
}
