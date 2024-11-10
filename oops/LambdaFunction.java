/** 
 * Storing the expression of the lambda function in a method, and passing that method.
 * To use a lambda expression in a method, the method should have a parameter
 *  with a single-method interface as its type. Calling the interface's method will run the lambda expression:
 */

interface StringFunction {
    String run(String str);
}
  
public class LambdaFunction{
    public static void main(String[] args) {
      StringFunction exclaim = (s) -> s + "!";
      StringFunction ask = (s) -> s + "?";
      printFormatted("Hello", exclaim);
      printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
      String result = format.run(str);
      System.out.println(result);
    }
}
  