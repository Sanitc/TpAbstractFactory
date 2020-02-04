package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Item;
import fr.mds.tpabstractfactory.interfaces.Shape;

public class Circle implements Shape, Item {

	public static final String CIRCLE = "Circle";

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(CIRCLE);
	}

	@Override
	public String getName() {
		
		return CIRCLE;
	}

}
