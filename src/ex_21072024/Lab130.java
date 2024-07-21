package ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        //coding program
        //factorial
        //n=5 , factorial-> 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ,will print factorial");
        int n = sc.nextInt();

        int fact = 1;
        //5 -> i =1 to 5- 1*2 = fact,
        for(int i=1; i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
