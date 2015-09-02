/*

    Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
    
    Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. 
    The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for multiples of 5,
     "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on. The output shall look like:

     1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
    Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
    23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza

    TRY: Modify the program to use if else ladder (if ... else if ... else if ... else) instead.
 */
public class CozaLozaWoza {   // saved as "CozaLozaWoza.java"
   public static void main(String[] args) {
      int lowerbound = 1;
      int upperbound = 110;
      for (int number = lowerbound; number <= upperbound; ++number) {
         // Print "Coza" if number is divisible by 3
         if (......) {   
            System.out.print("Coza");
         }
         // Print "Loza" if number is divisible by 5
         if (......) {
            System.out.print(.....);
         }
         // Print "Woza" if number is divisible by 7
         ......
         // Print the number if it is not divisible by 3, 5 and 7
         if (......) {
            ......
         }
         // Print a newline if number is divisible by 11; else print a space
         if (......) {
            System.out.println();
         }
      }
   }
}