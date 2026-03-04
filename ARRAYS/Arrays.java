import java.util.Arrays;
import java.util.Scanner;

public class Day2Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] goods;
        int lengthofgoods;
        String yorn;
        String y = "y";
        Boolean isfound = false;
        String target;

        System.out.print("enter the total nomber of item u like to add :");
        lengthofgoods = scanner.nextInt();
        scanner.nextLine();

        goods = new String[lengthofgoods];

        for(int i = 0; i < goods.length; i++){
            System.out.print("Etert the items u like to storer :");
            goods[i] = scanner.nextLine();
        }

        System.out.print("print y to ckeck the array: and n to not ");
        yorn = scanner.nextLine();
        
        if (yorn.equals(y)){
            for(int j = 0; j < goods.length; j++){
                System.out.println(goods[j]);
            }
        } else {
            System.out.println("Entered no");
        }

        Arrays.sort(goods);

        System.out.println("Sorted items:");
        for(String item : goods){
            System.out.println(item);
        }

        System.out.print("Enter the item to search: ");
        target = scanner.nextLine();

        for(int k = 0; k < goods.length; k++){
            if(goods[k].equals(target)){
                System.out.println("item is found at index " + k);
                isfound = true;
                break;
            }
        }
        
        if(!isfound){
            System.out.println("item is not found in the array");
        }
        
        scanner.close();
    }
}
