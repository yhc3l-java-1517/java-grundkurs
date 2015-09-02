/*

    Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
    
    Write a program that print the numbers 1 - 9 as words i.e. "ONE", "TWO",... , "NINE", "OTHER" 
     Use (a) a "nested-if" statement; (b) a "switch-case" statement.
 */
class Exercise1 {
    public static void main(String args[]){
        if(args.length >= 1){
            byte num = Byte.parseByte(args[0], 10);
            /* Your code here */
            System.out.println(num);
        } else {
            System.out.println("No number sent");
        }        
    }
}