class DemoPoint 
{
	public static void main(String[] args)
	{
		Point goodGuy;
		Point badGuy;
		goodGuy = new Point(10, 50);
		badGuy = new Point(30, 97);
		
		System.out.println("goodGuy y " + goodGuy.y);
		
		int a = 50;
		System.out.println("a: " + a);
		
		int distance = badGuy.getDistance(goodGuy, a);
		
		System.out.println("a: " + a);
		System.out.println("goodGuy y " + goodGuy.y);
		
		System.out.println("Distance between badGuy and goodGuy " + distance);
	}
}