package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        // program name, age, salary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        System.out.println("Your details are" + name);
        System.out.println("Your age is" +age);
        System.out.println("Your Salary is" +salary);

    }
}
