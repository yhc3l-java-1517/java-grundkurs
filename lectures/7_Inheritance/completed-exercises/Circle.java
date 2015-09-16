public class Circle extends Shape{
	private double radius;
	Circle(){
		super();
		setRadius(1.0);
	}
	Circle(double radius){
		super();
		this.setRadius(radius);
	}
	Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return Math.PI * (this.getRadius() * this.getRadius());
	}
	public double getPerimeter(){
		return Math.PI * (2* this.getRadius());
	}
	public String toString(){
		return  "A Circle with radius="+this.getRadius()+", which is a subclass of "+ super.toString();
	}
	public boolean equals(Object obj){
		if(obj instanceof Circle){
			Circle circle = (Circle)obj;
			return (super.equals(obj) && circle.getRadius() == this.getRadius());
		}
		return false;
		
	}
	
}
