package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Color;
import fr.mds.tpabstractfactory.interfaces.Item;

public class Green implements Color,Item {

	public static final String GREEN = "Green";
	
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println(GREEN);
	}

	@Override
	public String getName() {
		return GREEN;
	}

}
