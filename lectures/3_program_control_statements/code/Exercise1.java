public class Exercise1 {
	public static void main(String[] args) throws java.io.IOException {
		char guess ;
		char answer = 'f';
		System.out.println("Press a key followed by enter:");
		guess = (char)System.in.read();
		if(guess == answer)
		{
			System.out.println("Correct");
		} 
			else 
		{
			System.out.println("Wrong");
		}
	}
}