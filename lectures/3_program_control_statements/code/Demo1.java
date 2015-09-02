public class Demo1 {
	public static void main(String[] args) throws java.io.IOException {
		char ch;
		System.out.println("Press a key followed by enter:");
		ch = (char)System.in.read();
		System.out.println("You pressed " + ch);
		ch = (char)System.in.read();
		System.out.println("You pressed " + ch);
	}
}