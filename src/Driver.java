import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver {

	public static void main(String[] args) {
		Square sq= new Square(100);
		System.out.println(sq.getArea());
		
		Rectangle rect =new Rectangle(50, 80);
		System.out.println(rect.getArea());
		
		double tasnhinguvec = 15.6;
		System.out.println(Math.factorial((int)tasnhinguvec));
		System.out.println(Math.factorialLoop((int)tasnhinguvec));
	}
	

}
