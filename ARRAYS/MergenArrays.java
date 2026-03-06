import java.util.Arrays;
import java.util.Scanner;

public class MergenArrays {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] a;
    int[] b;

    System.out.print("Enter size of first array: ");
    a = new int[scanner.nextInt()];
    
    for (int i = 0; i < a.length; i++) {
        System.out.println("Enter elements for first array: ");
        a[i] = scanner.nextInt();
    }

    System.out.print("Enter size of second array: ");
    b = new int[scanner.nextInt()];
    
    for (int i = 0; i < b.length; i++) {
        System.out.println("Enter elements for second array: ");
        b[i] = scanner.nextInt();
    }

    int[] merged = new int[a.length + b.length];
    for (int i =0; i < a.length; i++) {
        merged[i] = a[i];
    }
    for (int i =0; i < b.length; i++) {
        merged[a.length + i] = b[i];
    }
    Arrays.sort(merged);
    System.out.print("Merged array: ");
    for (int i = 0; i < merged.length; i++) {
        System.out.print(merged[i] + " ");
    }

    scanner.close();

}
}
