class Demo7 {

	public static void main(String[] args) {
		char ch;
		// The char 'A' and 'a' are seperated by 32.
		for (int i = 0; i < 10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);

			// This statement turns off the 6th bit;
			ch = (char) ((int) ch | 32);// This turns on the 6th bit.
			// The number 32.
			// 0000 0000 0010 0000
			// i.e. Only 6th should change.
			System.out.print(ch + " ");

		}

	}

}
