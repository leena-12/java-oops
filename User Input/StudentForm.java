import java.util.Scanner;

public class StudentForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();  

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n----- Student Information -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA   : " + cgpa);
        System.out.println("--------------------------------");

        sc.close();
    }
}