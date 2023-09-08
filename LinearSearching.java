import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {

        // asking the user for the length of the array
        // asking user to enter the values for the array
        // asking for which value to search
        // printing the result.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of array: ");
        int length = scanner.nextInt();

        int[] uarray = new int[length];

        System.out.println("Enter the values for the array: ");
        for(int i=0;i<length;i++){
            uarray[i]=scanner.nextInt();
        }

        System.out.println("Enter the value to search: ");
        int search = scanner.nextInt();

        boolean valuefound=false;
        int position=0;
        for(int i=0;i<length;i++){
            if(uarray[i]==search){
                valuefound =true;
                position=i;
            }
        }
        if(valuefound){
            System.out.println(search + " is present at "+position+" position");
        }
    }
}
