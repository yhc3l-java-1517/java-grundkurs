class Demo5 
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		System.out.println("Keep typing and pressing enter");
		for(int i = 0; (char)System.in.read() != 'S'; i++)
		{
			System.out.println("Pass #" + i);
		}
	}
}