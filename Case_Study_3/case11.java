package Case_Study_3;

import java.util.Scanner;
import java.util.Stack;

public class case11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> cars = new Stack<>();

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            if (cars.size() < 5) {
                System.out.print("Enter car number: ");
                String car = sc.nextLine();

                cars.push(car);
            } else {
                System.out.println("Parking is full");
                break;
            }
        }

        System.out.println("Cars in parking: " + cars);

        if (!cars.empty()) {
            System.out.println("Last parked car leaving: " + cars.pop());
        }

        System.out.println("Remaining cars: " + cars);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        int charge;

        if (hours <= 2) {
            charge = 50;
        } else {
            charge = 50 + (hours - 2) * 20;
        }

        System.out.println("Parking charge: ₹" + charge);

        sc.close();
    }
}
