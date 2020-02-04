package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Color;
import fr.mds.tpabstractfactory.interfaces.Shape;

public abstract class AbstractFactory {
		
	public abstract Shape getShape(String uneShape);	
		
	
	public abstract Color getColor(String uneColor);
	
}
