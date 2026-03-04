
import java.util.Scanner;

public class Day1ArraysBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int size;

        System.out.println("enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the number: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("sum of all numbers in the array is: " + sum);
        
    }
    
}
