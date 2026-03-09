
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        // traversing an array 

        int[] arr1 = {1,2,3,4,45,5,6,7,};

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        //sorting an array using while loop

        int i = 0;
        while(i < arr1.length - 1){
            int j = 0;
             while(j < arr1.length - i -1){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
                j++;
             }
             i++;
        }
        // printing the sorted array
        for(int k = 0; k < arr1.length; k++){
            System.out.println(arr1[k]);
        }

        // searching an element in an array using linear search
        System.out.println("Enter the element to search: ");
        int target = scanner.nextInt();
        boolean found = false;

        for(int i1  = 0; i1 <arr1.length; i1++){
            if(arr1[i1] == target){
                found = true;
                System.out.println("Element found at index " + i1);
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
