public class Triangle extends TwoDShape{
	private String color;
	Triangle(double width, double height, String color){
		super(width, height);
		this.color = color;
	}
	public double getArea(){
		return super.getWidth() * super.getHeight() / 2;
	}
	public String getColor(){
		return this.color;
	}
	public String toString(){
		return "Triangle width:" + getWidth() + " height: " + getHeight();
	}
}
