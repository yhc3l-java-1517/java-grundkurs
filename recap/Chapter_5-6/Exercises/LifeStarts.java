/*
Any live cell with fewer than two live neighbours dies, as if by needs caused by underpopulation.
Any live cell with more than three live neighbours dies, as if by overcrowding.
Any live cell with two or three live neighbours lives, unchanged, to the next generation.
Any dead cell with exactly three live neighbours cells will come to life.
*/

/*

Game of Life
http://www.youtube.com/watch?v=FdMzngWchDk

System.out.print("\033[H\033[2J");
*/
class LifeStarts {
	public static void main(String[] args)
	 throws java.lang.InterruptedException{
		Life earth = new Life(55);
		earth.drawWorld();
		while(true){
			Thread.sleep(500);
			earth.nextGeneration();
			earth.drawWorld();
		}
	}
}