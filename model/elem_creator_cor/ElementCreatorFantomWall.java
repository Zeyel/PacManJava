package com.model.elem_creator_cor;

import com.model.Element;
import com.model.FantomWall;
import com.model.World;

public class ElementCreatorFantomWall extends ElementCreator {

	public ElementCreatorFantomWall(ElementCreator next) {
		super(next);
	}	
	
	@Override
	public Element handle(World world, int x, int y, int type) {
		
		if(type != 3) {
			return next != null ? next.handle(world, x, y, type) : null;
		}
		
		return new FantomWall(world,x,y);
	}

}
