package Case_Study_on_ExceptionHandling;
import java.util.Scanner;

public class case1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        int seats;
        int availableSeats = 40;

        try {
            System.out.print("Enter age: ");
            age = sc.nextInt();

            System.out.print("Enter number of seats: ");
            seats = sc.nextInt();

            if (age <= 0) {
                throw new Exception("Invalid age");
            }

            if (seats <= 0) {
                throw new Exception("Invalid number of seats");
            }

            if (seats > availableSeats) {
                throw new Exception("Insufficient seats");
            }

            System.out.println("Ticket booked successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
