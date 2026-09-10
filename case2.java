package Case_Study_on_ExceptionHandling;
import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        double amount;
        try {
            System.out.print("Enter withdrawal amount: ");
            amount = sc.nextDouble();

            if (amount <= 0) {
                throw new Exception("Invalid withdrawal amount");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);

        } 
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
