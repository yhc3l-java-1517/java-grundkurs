package java_course32;

public class Demo7 {
	private int[] nums;
	 
	Demo7(int[] nums){
		this.nums = nums;
	}
	
	public void analyze(){
		Inner inObj = new Inner();
		System.out.println("Min:"+ inObj.min());
		System.out.println("Max:"+ inObj.max());
		System.out.println("Avg:"+ inObj.avg());
	}
	class Inner{
		int min(){
			int min = nums[0];
			for (int number : nums) {
				min = (number < min) ? number : min;
			}
			return min;
		}
		
		int max(){
			int max = nums[0];
			for (int number : nums) {
				max = (number > max) ? number : max;
			}
			return max;
		}
		
		int avg(){
			int sum = 0;
			for (int number : nums) {
				sum += number;
			}
			return sum / nums.length;
		}
	}
	
}
