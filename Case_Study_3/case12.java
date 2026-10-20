package Case_Study_3;

import java.util.Scanner;
import java.util.Stack;

public class case12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Double> students = new Stack<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter percentage: ");
            students.push(sc.nextDouble());
        }

        while (!students.empty()) {

            double percentage = students.pop();
            int scholarship;

            if (percentage >= 90) {
                scholarship = 20000;
            } else if (percentage >= 80) {
                scholarship = 15000;
            } else if (percentage >= 70) {
                scholarship = 10000;
            } else if (percentage >= 60) {
                scholarship = 5000;
            } else {
                scholarship = 0;
            }

            System.out.println("Percentage: " + percentage);
            System.out.println("Scholarship: ₹" + scholarship);
            System.out.println();
        }

        sc.close();
    }
}
