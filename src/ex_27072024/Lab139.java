package ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        //arrays -> new
        int[] marks = new int[3];
        //index - 0,1,2
        //len - 3
        Scanner sc = new Scanner(System.in);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[0] = sc.nextInt();
        marks[1]=92;
        marks[2]=93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
       // System.out.println(marks[3]); //arrayindexoutofbound

        boolean[] is_married = {true, false, true};
         for(int i = 0; i<marks.length; i++){
             System.out.println(i + " -> "+ marks[i]);
         }
         String weekDays[] = {"Sunday","Monday", "Tuesday", "Wednesday"};
         for(int i = 0; i< weekDays.length; i++){
             System.out.println(weekDays[i]);

         }
         //array index always start from 0



    }
}
