package com.model.elem_creator_cor;

import java.io.Console;

import com.model.Element;
import com.model.Path;
import com.model.World;

public class ElementCreatorPath extends ElementCreator {

	public ElementCreatorPath(ElementCreator next) {
		super(next);
	}
	
	@Override
	public Element handle(World world, int x, int y, int type) {

		if(type != 1) {
			return next != null ? next.handle(world, x, y, type) : null;
		}

		return new Path(world,x,y);
		
	}

}
