import java.io.IOException;

class GradeAverage {

	public static void main(String[] args) throws IOException  {
		int[] grades;
		int numberOfStudents;
		System.out.println("Please enter number of students");
		numberOfStudents = readNumberFromTerminal();
		if(numberOfStudents > 0){
			grades = new int[numberOfStudents];	
			for(int i = 0; i < grades.length; i++){
				int grade;
				// Read a number from the terminal, if it is not a valid grade ask for it again
				do {
					System.out.println("Enter the grade for student " + (i + 1) + ":");
					grade = readNumberFromTerminal();
				}while(grade < 0 || grade > 100);
				// The grade must be valid here so we can save it in the correct place in the array
				grades[i] = grade;
			}
			// Loop through and show the contents of the array
			System.out.println("All " + numberOfStudents + " students registered.");
			for (int grade : grades) {
				System.out.println(grade);
			}
		} else {
			System.out.println("Invalid number please reenter number of students");
		}
	}
	
	/*
	 * readNumberFromTerminal encapsulates all the code to read a number from the terminal
	 * It returns a positive number if the number was valid and -1 if the input was not a valid number.
	 */
	public static int readNumberFromTerminal() throws IOException{
		char ch;
		String input = "";
		ch = (char) System.in.read();
		while (ch != '\n') {
			// A simple error trap makes sure that the characters entered are
			// numbers
			if (ch >= '0' && ch <= '9') {
				input += ch;
			} else {
				while (System.in.read() != '\n');
				input = "";
				break;
			}
			ch = (char) System.in.read();
		}
		if(input.length() > 0){
			return Integer.parseInt(input);
		} else {
			return -1;
		}
	}
}