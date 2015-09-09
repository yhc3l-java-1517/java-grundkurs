class ReadNumberFromTerminal {
	public static void main(String[] args)
	throws java.io.IOException {
		System.out.print("Enter a number: ");
		int myNumber = readNumber();
		System.out.println(myNumber);
	}
	
	static int readNumber()
	throws java.io.IOException {
		String output = "";
		char currentChar = (char)System.in.read(); 
		while(currentChar != '\n'){
			output += currentChar;
			currentChar = (char)System.in.read();
		}
		return Integer.parseInt(output);
	}
}