class Point 
{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	int getDistance(Point otherPoint, int i){
		int xLength = this.x - otherPoint.x;
		int yLength = this.y - otherPoint.y;
		otherPoint.y = 1000;
		i = 500;
		int distance = (int)Math.sqrt((xLength * xLength) + (yLength * yLength));
		return distance;
	}
}