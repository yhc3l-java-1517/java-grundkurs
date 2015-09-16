public abstract class TwoDShape {
	private double width;
	private double height;
	TwoDShape(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public final void showDimensions(){
		System.out.println("Width "+ getWidth() + " Height "+ getHeight());
	}
	public double getWidth() {	return width;}
	public void setWidth(double width) {this.width = width;}
	public double getHeight() { return height; }
	public void setHeight(double height) {
		this.height = height;
	}
	public abstract double getArea();
	
}
