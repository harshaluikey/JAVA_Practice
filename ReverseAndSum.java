import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int num = scanner.nextInt();
        int rev = 0;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            sum += digit;
            num = num/10;
        }
        System.out.println("Reverse of the entered number is: " + rev);
        System.out.println("Sum of all the digits in the number is: " + sum);
    }
}
