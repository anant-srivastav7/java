package Case_Study_3;

import java.util.Scanner;
import java.util.Vector;

public class case8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Integer> ages = new Vector<>();

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age: ");
            ages.add(sc.nextInt());
        }

        for (int age : ages) {

            double fare;

            if (age < 5) {
                fare = 0;
            } else if (age <= 12) {
                fare = 500 * 0.50;
            } else if (age <= 59) {
                fare = 500;
            } else {
                fare = 500 * 0.70;
            }

            System.out.println("Age: " + age);
            System.out.println("Fare: ₹" + fare);
            System.out.println();
        }

        sc.close();
    }
}
