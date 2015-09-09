class Echo {
	public static void main(String[] args)
	throws java.io.IOException {
		char ch;
		while(true){
			System.out.print("Type a word: ");
			do {
				ch = (char)System.in.read();
				System.out.print(ch);
			} while(ch != '\n');
		}
	}
}