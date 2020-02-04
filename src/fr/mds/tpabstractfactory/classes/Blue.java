package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Color;
import fr.mds.tpabstractfactory.interfaces.Item;

public class Blue implements Color, Item {

	public static final String BLUE = "Blue";

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println(BLUE);
	}

	@Override
	public String getName() {
		return BLUE;
	}

}
