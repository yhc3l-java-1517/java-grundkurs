class Demo2a {

	public static void main(String[] args) {
		int nums[] = { 99, -10, 100123,18, -978, 5623, 463, -9, 287, 49};
		int min, max;
		min = max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < min){
				min = nums[i];
			}
			if(nums[i] > max){
				max = nums[i];
			}
		}
		System.out.println("min and max: " + min + " " + max);
	}
}
