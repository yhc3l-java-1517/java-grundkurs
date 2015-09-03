class Demo5 
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		char ch;
		System.out.println("Keep typing and pressing enter");
		for(int i = 0; (ch = (char)System.in.read()) != 'S'; i++)
		{
			System.out.println(ch);
			while((char)System.in.read() != '\n');
		}
	}
}