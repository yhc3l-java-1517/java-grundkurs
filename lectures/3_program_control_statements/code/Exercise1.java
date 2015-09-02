public class Exercise1 {
	public static void main(String[] args) throws java.io.IOException {
		char guess ;
		char answer = 'f';
		System.out.println("Guess the letter I am thinking of:");
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