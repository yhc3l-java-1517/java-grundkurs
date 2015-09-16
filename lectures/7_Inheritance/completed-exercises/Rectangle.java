public class Rectangle extends Shape {
	private double width;
	private double height;

	Rectangle() {
		this.setWidth(1.0);
		this.setHeight(1.0);
	}

	Rectangle(double width, double height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.setWidth(width);
		this.setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return this.getWidth() * this.getHeight();
	}

	public double getPerimeter() {
		return (2 * this.getWidth()) + (2 * this.getHeight());
	}

	public String toString(){
		return  "A Rectangle with width "+this.getWidth()+" and height="+this.getHeight()+", which is a subclass of " + super.toString();
	}
	public boolean equals(Object obj){
		if(obj instanceof Rectangle){
			Rectangle rect = (Rectangle)obj;
			return (super.equals(obj) && rect.getHeight() == this.getHeight() && rect.getWidth() == this.getWidth());
		}
		return false;
	}
}
