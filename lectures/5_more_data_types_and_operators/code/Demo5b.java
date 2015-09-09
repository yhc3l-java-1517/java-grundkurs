class Demo5b {

	public static void main(String[] args) {
		String str1 = "the cat sat on the mat";
		String str2 = new String(str1.substring(4, 11));
		System.out.println("The length of str1 is " + str1.length());
		System.out.println("The value of str2 is " + str2);
		for(int i = 0; i < str1.length(); i++){
			System.out.println(str1.charAt(i));
		}
		if(str1.equals(str2)){
			System.out.println("The strings are the same");
		}
		System.out.println("The first index of the is "+ str1.indexOf("the"));
		System.out.println("The last index of the is "+ str1.lastIndexOf("the"));
		
	}

}
