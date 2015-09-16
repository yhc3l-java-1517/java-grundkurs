
public class ShapeTest {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		shapes[0] = new Circle(3.0, "pink", true);
		shapes[1] = new Square(78.0, "black", true);
		shapes[2] = new Rectangle(3.0, 5.0);
		shapes[3] = new Circle(4.7, "blue", false);
		shapes[4] = new Circle();
		
		for(Shape shape: shapes){
			System.out.print(shape.equals(new Circle(4.7, "blue", false)));
			System.out.println(shape.getArea());
		}
		
		Circle cir1 = new Circle(4.7, "blue", false);
		System.out.println(cir1.equals(new Circle(4.7, "blue", false)));
		System.out.println(cir1.equals(new Circle(4.8, "blue", false)));
		
	}

}
