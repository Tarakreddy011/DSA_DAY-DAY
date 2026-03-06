package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        System.out.print("Enter size of first array: ");
        int[] arr1 = new int[scanner.nextInt()];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr1.length; i++) arr1[i] = scanner.nextInt();

       
        System.out.print("Enter size of second array: ");
        int[] arr2 = new int[scanner.nextInt()];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr2.length; i++) arr2[i] = scanner.nextInt();

        
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

      
        Arrays.sort(merged);

       
        double median;
        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            median = (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            median = merged[mid];
        }

       
        System.out.println("Merged & Sorted: " + Arrays.toString(merged));
        System.out.println("Median: " + median);
        
        scanner.close();
    }
}