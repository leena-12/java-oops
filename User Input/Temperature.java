import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

        System.out.print("\nEnter temperature in Fahrenheit: ");
        double tempF = sc.nextDouble();

        double tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF + " Fahrenheit = " + tempC + " Celsius");

        sc.close();
    }
}