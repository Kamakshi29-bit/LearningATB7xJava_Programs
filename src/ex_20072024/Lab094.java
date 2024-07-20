package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //vowel
        //aeiou
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char");
        char user_input = sc.next().charAt(0);
        switch(user_input){
            case 'a','e','i', 'o', 'u' :
                System.out.println("Vowel");
                break;

                // new feature
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;

        }
    }
}
