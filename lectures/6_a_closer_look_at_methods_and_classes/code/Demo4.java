

public class Demo4 {
	private static long startTime;
	// Static block used if you need to do some first time setup
	static{
		startTime = System.currentTimeMillis();
	}
	
	public static long getStartTime(){
		return startTime;
	}
	
	public static int add(int a, int b){
		return a + b;
	}
	
	public static int add(int a, int b, int c){
		return a + b + c;
	}
	
	public static int add(int ... v){
		int sum = 0;
		for (int i : v) {
			sum += i;
		}
		return sum;
	}
	public static boolean passed(int grade){
		return grade > 99;
	}
	
	public static boolean passed(String grade){
		return (grade.equals("vg") || grade.equals("g"));
	}
	
	public static String passed(Double grade){
		return (grade > 99) ? "Yippeee": "Retake";
	}
}
