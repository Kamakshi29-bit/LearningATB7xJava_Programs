package ex_27072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        //where we take the user input of five subjects
        //function available in the stack
        //Figure out inputs = datatype - int/float
        //scanner class
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.println("Enter the marks of the subject1");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the marks of the subject2");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of the subject3");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks of the subject4");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks of the subject5");
        marks[4] = sc.nextFloat();
        float avg = (marks[0] + marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is -> "+avg);
        //for loop can also be used
        sc.close();
    }
}
