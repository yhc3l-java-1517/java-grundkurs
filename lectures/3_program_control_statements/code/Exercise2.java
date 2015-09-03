public class Exercise2
{
	public static void main(String[] args) throws java.io.IOException 
	{
		char guess ;
		char answer = 'f';
		while(true)
		{
			System.out.println("Guess the letter I am thinking of:");
			guess = (char)System.in.read();
			if(guess == answer)
			{
				System.out.println("Correct");
				break;
			} 
			else 
			{
				System.out.print("Wrong");
				if(guess >= 'a' && guess <= 'z'){
					if(answer < guess)
					{
						System.out.println(" the character is lower than " + guess);
					} 
					else 
					{
						System.out.println(" the character is greater than " + guess);
					}
				} else {
					System.out.println(" the character is between a-z");
				}
				
			}
			while((char)System.in.read() != '\n');
			System.out.println("-------------------------------------");
		}
	}
}