package java_course32;

public class Demo2Test {

	public static void main(String[] args) {
		Demo2 item = new Demo2();
		Demo2 item2 = new Demo2();
		item.x = 10;
		item2.x =20;
		Demo2.y =100;
		System.out.println(item.sum());
		System.out.println(item2.sum());
		// Talk about Math
	}

}
