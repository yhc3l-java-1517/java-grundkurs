public class Arithmetic {
  public static void main (String[] args) {
    int operand1, operand2;
    char theOperator;
  
    // Check if there are 3 command-line arguments in the
    //  String array args[] by using length variable of array.
    if (args.length != 3) {
      System.err.println("Usage: java Arithmetic int1 int2 op");
      return;
    }
   
    // Convert the 3 Strings args[0], args[1], args[2] to int and char.
    // Use the Integer.parseInt(aStr) to convert a String to an int.
    operand1 = Integer.parseInt(args[0]);
    operand2 = Integer.parseInt(args[1]);
   
    // Get the operator, assumed to be the first character of
    //  the 3rd string. Use method charAt() of String.
    theOperator = args[2].charAt(0);
    System.out.print(args[0] + args[2] + args[1] + "=");
   
    switch(theOperator) {
      case ('-'): System.out.println(operand1 - operand2); break;
      case ('+'): System.out.println(operand1 + operand2); break;
      case ('*'): System.out.println(operand1 * operand2); break;
      case ('/'): System.out.println(operand1 / operand2); break;
      default:
        System.err.println("Error: invalid operator!"); 
    }
  }
}