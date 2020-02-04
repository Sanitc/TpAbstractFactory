package fr.mds.tpabstractfactory.classes;

public class ColorFactory extends AbstractFactory {

	public static final String COLOR = "Color";

	public Color getColor(String uneColor){
		if(uneColor.equals(Green.GREEN)) {
			return new Green() ;
		}else if(uneColor.equals(Red.RED)) {
			return new Red() ;
		}else if(uneColor.equals(Blue.BLUE)) {
			return new Blue() ;
		}else {
			return null;
		}
	}

	@Override
	public Shape getShape(String uneShape) {
		// TODO Auto-generated method stub
		return null;
	}
}
