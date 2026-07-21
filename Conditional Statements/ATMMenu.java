import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        System.out.println("--- ATM Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                balance += depositAmount;
                System.out.println("Deposit successful. New balance: " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= withdrawAmount;
                    System.out.println("Withdrawal successful. New balance: " + balance);
                }
                break;

            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}