package ex_27072024;

import java.util.Scanner;

public class Lab146a {
    public static void main(String[] args) {
        //avg of 5 subjects using array
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of the sub " + (i + 1));
            marks[i] = sc.nextFloat();
        }
        //marks can be printed to verify input
        // for(int i= 0;i<marks.length;i++){
     //   System.out.println("marks of sub" + (i + 1) + ":" + marks[i]);
    //}
        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is ->"+avg);
        int j =0;
        while(j<marks.length){
            System.out.println(marks[j]);
            j++;
        }
        sc.close();

    }
}
