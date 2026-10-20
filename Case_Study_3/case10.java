package Case_Study_3;

import java.util.Stack;

public class case10 {
    public static void main(String[] args) {

        Stack<Integer> transactions = new Stack<>();

        int balance = 20000;

        int[] withdrawals = {5000, 3000, 8000, 6000};

        for (int amount : withdrawals) {

            if (amount <= balance) {
                balance = balance - amount;
                transactions.push(amount);

                System.out.println("Withdrawal successful: ₹" + amount);
            } else {
                System.out.println("Insufficient balance for: ₹" + amount);
            }
        }

        System.out.println("Remaining balance: ₹" + balance);
        System.out.println("Latest successful transaction: ₹" + transactions.peek());

        System.out.println("Transactions: " + transactions);
    }
}
