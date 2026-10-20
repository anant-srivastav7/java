package Case_Study_3;

import java.util.ArrayList;
import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> salaries = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary: ");
            salaries.add(sc.nextInt());
        }

        System.out.println("Salaries: " + salaries);

        int highest = salaries.get(0);
        int total = 0;

        for (int salary : salaries) {
            if (salary > highest) {
                highest = salary;
            }

            total = total + salary;
        }

        double average = (double) total / salaries.size();

        System.out.println("Highest salary: " + highest);
        System.out.println("Total salary: " + total);
        System.out.println("Average salary: " + average);

        sc.close();
    }
}
