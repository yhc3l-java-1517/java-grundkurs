class Demo4 {
	// Edit of Demo2b
	public static void main(String[] args) {
		int nums[] = { 99, -10, 100123,18, -978, 5623, 463, -9, 287, 49};
		int min, max;
		min = max = nums[0];
		// For-each style loop
		for (int val : nums) {
			if(val < min){
				min = val;
			}
			if(val > max){
				max = val;
			}
		}
		System.out.println("min and max: " + min + " " + max);
	}
}
