package ex_27072024;

import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        //max in an array
        //find max salary in thr salary array
        int [] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        //Infsys = automation tester interview qsn
        int max = salaries[0];
        int min=salaries[0];

        for(int i = 0; i< salaries.length; i++){
            if(salaries[i] > max){
                max = salaries[i];
            }
            if(min>salaries[i]){
                min=salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
       // Arrays.sort(salaries);
     //   System.out.println(salaries[salaries.length - 1]);
    }
}
