
import java.util.Arrays;
import java.util.Scanner;



public class DAY1Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        String name[] = {"tarak", "Reddy", "comeback"};

        //System.out.println(name);
        Arrays.sort(name);
        int size = name.length;

        System.out.println("size  of array is " + size);
        Arrays.fill(name, "tarak");

        name[1] = "get";

        for(int i = 0;  i < name.length; i++){
            System.out.println(name[i]);
        }

        String[] fruits;
        int sizeoffruits;
        
        System.out.println("enter the # of fruits: ");
	    sizeoffruits = sc.nextInt();
	    sc.nextLine(); //for scannerbuffer in intput
	
	fruits = new String[sizeoffruits];
	
	for(int a = 0; a<fruits.length; a++){
		System.out.println("enter the fruit name: ");
		fruits[a] = sc.nextLine();
	}

    Arrays.sort(fruits);

    for(int b =0; b<fruits.length;b++){
        System.out.println(fruits[b]);
    }


    //linera serach in


       String target;
        boolean isfound = false; // flag to check the found element in the array  the time complexcity
		

        System.out.println("enter the fruit to search: ");

        target = sc.nextLine();

        for(int c = 0; c<fruits.length; c++){
            if(fruits[c].equals(target)){
                System.out.println("fruit is found at index " + c);
                isfound = true;
                break;
            }
        }

        if(!isfound){
            System.out.println("fruit is not found in the array");
        }



        ///min and max in a array

        int[] num = {9,7,86,34,34834,2};

        int min; // min  value in the arrya 
        int max;  // max value in the array
		

        min = num[0];
        max = num[0];

        for(int d = 0; d<num.length;d ++){
            if(num[d]<min){
                min = num[d];
            }
            if(num[d]>max){
                max = num[d];
            }
        }
        System.out.println("min value is " + min);
        System.out.println("max value is " + max);

        sc.close();
    }	
}
