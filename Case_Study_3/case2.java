package Case_Study_3;

import java.util.ArrayList;
import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cart = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            cart.add(sc.nextLine());
        }

        System.out.println("Products in cart:");
        for (String product : cart) {
            System.out.println(product);
        }

        System.out.print("Enter product to search: ");
        String search = sc.nextLine();

        if (cart.contains(search)) {
            System.out.println("Product is in cart");
        } else {
            System.out.println("Product is not in cart");
        }


        System.out.print("Enter product to remove: ");
        String remove = sc.nextLine();

        if(cart.contains(remove)){
            cart.remove(remove);
        }else{
            System.out.println("Product is not cart");
        }
        
        System.out.println("Products after removal: ");
        for (String product : cart) {
            System.out.println(product);
        }

        sc.close();
    }
}
