class ControlStatements
{
	public static void main(String args[])
	{
		
		for(int age = 15; age < 25; age = age + 1){
			System.out.println(age);
			if(age > 18)
			{
				System.out.println("You can buy a beer.");
			}
			else 
			{
				System.out.println("Sorry you are too young.");
				System.out.println("Goodbye");
			}
		}
	}
}