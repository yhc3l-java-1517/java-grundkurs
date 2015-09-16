
public class Square extends Rectangle{
	Square(){
		super();
	}
	Square(double side){
		super(side, side);
	}
	Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	public double getSide(){
		return super.getWidth();
	}
	public void setSide(double side){
		super.setWidth(side);
		super.setHeight(side);
	}
	public void setWidth(double side){
		this.setSide(side);
	}
	public void setHeight(double side){
		this.setSide(side);
	}
	public String toString(){
		return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
	}
	public boolean equals(Object obj){
		if(obj instanceof Square){
			Rectangle rect = (Rectangle)obj;
			return super.equals(rect);
		} else {
			return false;
		}
	}
}
