package Case_Study_3;

import java.util.ArrayList;
import java.util.Scanner;

public class case5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> prices = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            prices.add(price);
            total = total + price;
        }

        double discount;

        if (total >= 10000) {
            discount = total * 0.20;
        } else if (total >= 5000) {
            discount = total * 0.10;
        } else if (total >= 2000) {
            discount = total * 0.05;
        } else {
            discount = 0;
        }

        double finalAmount = total - discount;

        System.out.println("Total: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);

        sc.close();
    }
}
