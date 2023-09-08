import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter Values For ArrayList: ");
        for(int i=0;i<5;i++){
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);

        for(int i=arrayList.size()-1;i>=0;i--){
            System.out.print(arrayList.get(i));

        }
    }
}
