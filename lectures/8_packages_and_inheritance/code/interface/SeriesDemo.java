public class SeriesDemo {

	public static void main(String[] args) {
			printInfo(new ByThrees());
			
	}
	public static void printInfo(Series series){
		for(int i = 0; i < 5; i++){
			System.out.println(series.getNext());
		}
		
		series.setStart(100);
		for(int i = 0; i < 5; i++){
			System.out.println(series.getNext());
		}
	}

}
