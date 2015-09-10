class Recursion2 {
	public static void main(String[] args){
		printBackwards("Hello");
	}
	public static void printBackwards(String word){
		if(word.length() > 1){
			System.out.print(word.charAt(word.length() - 1));
			printBackwards(word.substring(0, word.length() - 1));
		} else if(word.length() == 1) {
			System.out.print(word.charAt(word.length() - 1));
			System.out.println();
		}
		
	}
}