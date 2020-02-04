package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Color;
import fr.mds.tpabstractfactory.interfaces.Item;

public class Red implements Color, Item {

	public static final String RED = "Red";
	
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println(RED);
	}

	@Override
	public String getName() {
		return RED;
	}

}
