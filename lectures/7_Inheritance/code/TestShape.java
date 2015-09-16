public class TestShape {

	public static void main(String[] args) {
		Triangle tri = new Triangle(300, 500, "red");
		tri.showDimensions();
		System.out.println("Area " + tri.getArea());
		System.out.println("Color " + tri.getColor());
		
		TwoDShape tri2 = new Triangle(200, 400, "blue");
		tri2.showDimensions();
		System.out.println("Area " + tri2.getArea());
		
		Object[] shapes = {new Triangle(200, 400, "blue"), 
							  new Square(100)};
	
		for(Object shape: shapes){
			System.out.println(shape);
		}
	}

}
