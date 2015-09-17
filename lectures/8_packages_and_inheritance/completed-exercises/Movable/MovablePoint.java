package Movable;

public class MovablePoint implements Movable
{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override 
	public String toString()
	{
		return "MovablePoint x: " + this.x + " y: " + this.y; 
	}
	
	@Override
	public void moveUp()
	{
		y += ySpeed;
	}

	@Override
	public void moveDown()
	{
		y += ySpeed;
	}

	@Override
	public void moveLeft()
	{
		x -= xSpeed;
	}

	@Override
	public void moveRight()
	{
		x += xSpeed;
	}

}
