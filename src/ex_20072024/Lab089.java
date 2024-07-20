package ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        //number >20
        //number<20
        //number 10 or 20
        if(age>18){
            System.out.println("Goa");
        }else if(age >30){
            System.out.println("Goa or Maldives");
        }
        //multiple conditions
    }
}
