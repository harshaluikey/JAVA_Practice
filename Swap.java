//Program to swap numbers using a third number:

public class Swap {
  public static void main(String[] args){

  // Declaring the numbers and variables:
     int num1 = 5;
     int num2 = 10;
     int temp;  // Using a new variable as third variable
     System.out.println("Before: num1 = " + num1 + ",num2 = " +num2);

 //Swapping: 
     temp = num1;
     num1 = num2;
     num2 = temp;
     System.out.println("After: num1 = " + num1 + ",num2 = " +num2);
 }
}