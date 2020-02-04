package fr.mds.tpabstractfactory.classes;

import fr.mds.tpabstractfactory.interfaces.Item;

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

	public static Item getItem(String unItem) {
		
		Item item = (Item)new ShapeFactory().getShape(unItem);
		
		if(item == null) {
			item = (Item) new ColorFactory().getColor(unItem);
			return item;
		}
		return item;
	}
}
