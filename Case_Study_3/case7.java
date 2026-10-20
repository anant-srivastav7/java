package Case_Study_3;

import java.util.Scanner;
import java.util.Vector;

public class case7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Integer> units = new Vector<>();

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter units consumed: ");
            units.add(sc.nextInt());
        }

        for (int unit : units) {

            double bill;

            if (unit <= 100) {
                bill = unit * 2;
            } else if (unit <= 200) {
                bill = 100 * 2 + (unit - 100) * 3;
            } else {
                bill = 100 * 2 + 100 * 3 + (unit - 200) * 5;
            }

            if (bill > 1000) {
                bill = bill + bill * 0.10;
            }

            System.out.println("Units: " + unit);
            System.out.println("Bill: ₹" + bill);
            System.out.println();
        }

        sc.close();
    }
}
