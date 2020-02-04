package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Item;
import fr.mds.tpabstractfactory.interfaces.Shape;

public class Rectangle implements Shape,Item {

	public static final String RECTANGLE = "Rectangle";

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(RECTANGLE);
	}

	@Override
	public String getName() {
		
		return RECTANGLE;
	}

}
