package fr.mds.tpabstractfactory.classes;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String uneFactory) {
		
		if(uneFactory.equals(ColorFactory.COLOR)) {
			return new ColorFactory();
		}else if(uneFactory.equals(ShapeFactory.SHAPE)) {
			return new ShapeFactory();
		}else {
			return null;
		}			
	}
}
