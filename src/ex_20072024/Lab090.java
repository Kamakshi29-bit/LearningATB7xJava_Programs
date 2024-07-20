package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        //Grade calculator - interview qsn
        // A: 90 - 100
        // B: 80 - 89
        //C: 70 - 79
        //D: 60-69
        //F: 0 - 59
        //user input
        //score - data type - int
        //return -> grade - datatype - char
        //2. basic logic
        //if(score>=90 && score<=100) -> return A
        //else if score <=89 && score >=80 -> return B

        //write the code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score <= 0 || score > 100) {
            System.out.println("LOL, YOU ARE GOD?");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("your grade is =>" + grade);
        sc.close();
    }
}