package Case_Study_3;

import java.util.Scanner;
import java.util.Vector;

public class case9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Integer> marks = new Vector<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int passed = 0;
        int failed = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter marks: ");
            int mark = sc.nextInt();

            marks.add(mark);
            total = total + mark;

            if (mark >= 50) {
                passed++;
            } else {
                failed++;
            }

            if (mark >= 90) {
                System.out.println("Outstanding");
            } else if (mark >= 75) {
                System.out.println("Distinction");
            } else if (mark >= 60) {
                System.out.println("First Division");
            } else if (mark >= 50) {
                System.out.println("Second Division");
            } else {
                System.out.println("Fail");
            }
        }

        double average = (double) total / n;

        System.out.println("Total students: " + n);
        System.out.println("Passed students: " + passed);
        System.out.println("Failed students: " + failed);
        System.out.println("Class average: " + average);

        sc.close();
    }
}
