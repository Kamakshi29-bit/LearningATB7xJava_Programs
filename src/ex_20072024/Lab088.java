package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
//this is always available in all programs by default
//java.lang package

public class Lab088 {
    public static void main(String[] args) {
        //Max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
      //  System.out.println(Math.max(num1,num2));
        if(num1 > num2){
            System.out.println(num1);
        }else if(num2>num2){
                System.out.println(num2);
            } else {
            System.out.println("Equal");
        }
    }
}
