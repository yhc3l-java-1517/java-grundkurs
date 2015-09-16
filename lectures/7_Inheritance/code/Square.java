public class Square extends TwoDShape{
	Square(double length){
		super(length, length);
	}

	@Override
	public double getArea() {
		return super.getWidth() * super.getWidth();
	}
	public String toString(){
		return "Square length:" + getWidth();
	}

}
