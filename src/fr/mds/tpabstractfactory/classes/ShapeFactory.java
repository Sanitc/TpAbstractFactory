package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Color;
import fr.mds.tpabstractfactory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {
	
	public static final String SHAPE = "Shape";

	public Shape getShape(String uneShape){
		if(uneShape.equals(Square.SQUARE)) {
			return new Square() ;
		}
		else if(uneShape.equals(Circle.CIRCLE)) {
			return new Circle() ;
		}
		else if(uneShape.equals(Rectangle.RECTANGLE)){
			return new Rectangle() ;
		}else {
			return null;
		}
		
	}

	@Override
	public Color getColor(String uneColor) {
		// TODO Auto-generated method stub
		return null;
	}
}
