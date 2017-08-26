// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;
public class DebugFive2
{
   public static void main(String args[])
   {
      int num;
      int numTwo;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();
      System.out.print("Enter another number ");
      numTwo = input.nextInt();
      if (((numTwo / num) = (num / numTwo) = 0)) {
         System.out.println("One of these numbers is evenly divisible into the other");
      } else System.out.println("Neither of these numbers is evenly divisible into the other");
   }
}