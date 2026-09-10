package Case_Study_on_ExceptionHandling;
import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new Exception("No subjects entered");
            }

            int total = 0;

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    throw new Exception("Marks must be between 0 and 100");
                }

                total = total + marks;
            }

            double average = total / (double)n;

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
