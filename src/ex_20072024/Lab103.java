package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        // if a number is positive, negative or 0
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Positive Number");
        }else if(num<0){
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }
    }
}
