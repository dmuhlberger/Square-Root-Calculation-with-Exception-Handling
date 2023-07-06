import java.util.*;
public class SqrtException
{
   public static void main(String[] args) throws ArithmeticException
   {
     Scanner input = new Scanner(System.in);
      double num, result;
      String numString;
      System.out.println("Enter a number");
      numString = input.next();
      num = Integer.parseInt(numString);
      try
      {
         if(num < 0)
            throw(new ArithmeticException());
         result = Math.sqrt(num);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
        System.out.println("Can't take square root of negative number");
      }
   }
}