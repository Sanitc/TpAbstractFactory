package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Item;
import fr.mds.tpabstractfactory.interfaces.Shape;

public class Square implements Shape, Item {

	public static final String SQUARE = "Square";
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(SQUARE);
	}

	@Override
	public String getName() {
		
		return SQUARE;
	}

}
