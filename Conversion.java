import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dollars: ");
        double dollars = scanner.nextDouble();

        double cRate = 82.65;
        double inRupees = dollars * cRate;

        System.out.println(dollars + " Dollar(s) = " + inRupees + " INR" );
    }
}
