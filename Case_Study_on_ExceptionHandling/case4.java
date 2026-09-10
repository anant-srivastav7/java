package Case_Study_on_ExceptionHandling;
import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (price <= 0) {
                throw new Exception("Invalid product price");
            }

            if (quantity <= 0) {
                throw new Exception("Invalid quantity");
            }

            if (discount < 0 || discount > 100) {
                throw new Exception("Invalid discount percentage");
            }

            double bill = price * quantity;
            bill = bill - (bill * discount / 100);

            System.out.println("Final Bill: " + bill);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            if (payment < bill) {
                throw new Exception("Payment amount is less than the bill");
            }

            System.out.println("Payment successful");
            System.out.println("Change: " + (payment - bill));

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();


    }
}
