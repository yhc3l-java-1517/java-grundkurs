class Demo6 {

	public static void main(String[] args) {
		char ch;
		// The char 'a' and 'A' are seperated by 32.
		for (int i = 0; i < 10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);

			// This statement turns off the 6th bit;
			ch = (char) ((int) ch & 65503);// This turns off the 6th bit.
			// The number 65503.
			// 1111 1111 1101 1111.
			// i.e. Only 6th should change.
			System.out.print(ch + " ");

		}

	}

}
