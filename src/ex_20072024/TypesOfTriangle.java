package ex_20072024;

import java.util.Scanner;

public class TypesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle");
        System.out.println("Side1");
        int side1 = sc.nextInt();
        System.out.println("Side2");
        int side2 = sc.nextInt();
        System.out.println("Side3");
        int side3 = sc.nextInt();
        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle");
        }else if(side1 == side2 || side1 == side3 ){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }
    }
}
