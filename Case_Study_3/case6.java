package Case_Study_3;

import java.util.ArrayList;
import java.util.Scanner;

public class case6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> salaries = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary: ");
            salaries.add(sc.nextDouble());
        }

        for (double salary : salaries) {

            double bonus;

            if (salary >= 80000) {
                bonus = salary * 0.15;
            } else if (salary >= 50000) {
                bonus = salary * 0.10;
            } else if (salary >= 30000) {
                bonus = salary * 0.05;
            } else {
                bonus = 0;
            }

            double revisedSalary = salary + bonus;

            System.out.println("Salary: ₹" + salary);
            System.out.println("Bonus: ₹" + bonus);
            System.out.println("Revised Salary: ₹" + revisedSalary);
            System.out.println();
        }

        sc.close();
    }
    
}
