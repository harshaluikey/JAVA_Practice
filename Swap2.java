//Program to swap numbers without using a third number:

public class Swap2 {
  public static void main(String[] args){

  // Declaring the numbers and variables:
     int num1 = 5;
     int num2 = 10;
     System.out.println("Before: num1 = " + num1 + ",num2 = " +num2);

 //Swapping: 
     num1 = num1 + num2;
     num2 = num1 - num2;
     num1 = num1 - num2;
     System.out.println("After: num1 = " + num1 + ",num2 = " +num2);
 }
}