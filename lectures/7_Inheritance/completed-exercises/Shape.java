
public abstract class Shape  {
	private String color;
	private boolean filled;
	Shape(){
		this.setColor("green");
		this.setFilled(true);
	}
	Shape(String color, boolean filled){
		this.setColor(color);
		this.setFilled(filled);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString(){
		return "A Shape with color of " + this.getColor() +" and " + ((this.isFilled())?"filled":"not filled");
	}
	public abstract double getArea();
	public boolean equals(Object obj){
		if(obj instanceof Shape){
			Shape shp = (Shape)obj;
			return (shp.getColor() == this.getColor() && shp.isFilled() == this.isFilled());
		}
		return false;
	}
}
