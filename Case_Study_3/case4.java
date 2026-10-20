package Case_Study_3;

import java.util.ArrayList;
import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int total = 0;

            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks: ");
                int mark = sc.nextInt();

                marks.add(mark);
                total = total + mark;
            }

            double percentage = total / 5.0;

            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage);

            if (percentage >= 90) {
                System.out.println("Grade A");
            } else if (percentage >= 75) {
                System.out.println("Grade B");
            } else if (percentage >= 60) {
                System.out.println("Grade C");
            } else if (percentage >= 50) {
                System.out.println("Grade D");
            } else {
                System.out.println("Fail");
            }
        }

        sc.close();
    }
}
