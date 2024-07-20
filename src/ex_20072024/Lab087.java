package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // take user input and chck if number is even or odd
        //logic building
        // 1. figure out inputs
        //2. data type
        //3. do we need conversion
        //4. rough logic
        //5. optimise
        // 1. integer data type
        // take input in java -> scanner class - inbuilt
        // nextInt() -> input
        // - num%2==0 -> even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int user_input = sc.nextInt();
        System.out.println(user_input);
        if(user_input%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
