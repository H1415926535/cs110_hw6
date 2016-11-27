package shapes;

public class Rectangle {
	private int width  ;
	private int height;
	
	public Rectangle (int width, int height){
		this.height = height;
		this.width = width;
	}
	
	public int getArea () {
		return height*width;
	}
}