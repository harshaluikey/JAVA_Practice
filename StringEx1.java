import java.util.*;

public class StringEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String uinput = scanner.next();

        System.out.println("Original String: "+uinput);

        for(int i=uinput.length()-1;i>=0;i--){
            System.out.print(uinput.charAt(i));
        }
    }
}
