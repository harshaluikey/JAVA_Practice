import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication table for " + num + " is: ");
        for(int i=1; i<=10;i++){
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
