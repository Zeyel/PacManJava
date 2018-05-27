package com.model.elem_creator_cor;

import com.model.Element;
import com.model.Crossing;
import com.model.World;

public class ElementCreatorCrossing extends ElementCreator {

	public ElementCreatorCrossing(ElementCreator next) {
		super(next);
	}
		
	@Override
	public Element handle(World world, int x, int y, int type) {
		
		if(type != 2) {
			return next != null ? next.handle(world, x, y, type) : null;
		}
		
		return new Crossing(world,x,y);
	}
}
