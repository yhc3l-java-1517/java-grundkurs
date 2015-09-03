public class Demo {
	public static void main(String[] args){
		Vehicle car1;
		Vehicle car2;
		
		car1 = new Vehicle(50, 5, 2);
		car2 = new Vehicle(70, 6, 20);
		
		
		System.out.println("car1 range " + car1.range());
		System.out.println("car2 range " + car2.range());
	
	}

}
