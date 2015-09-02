class Demo6 
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		int i = 0;
		while(i < 5)
		{
			System.out.println("Type a word and press enter");
			i++;
		}

		char c;
		while( (c = (char)System.in.read()) != '\n')
		{
			System.out.println(c);
		}
	}
}