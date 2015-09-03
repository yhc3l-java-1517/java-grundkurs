public class Demo2 {

	public static void main(String[] args) {
		FDemo ob = new FDemo(0);
		for (int count = 1; count < 1000000; count++) {
			ob.generator(count);
		}
	}

}
