import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Add two numbers ---
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // --- Simple Interest ---
        System.out.print("\nEnter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}