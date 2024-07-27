package ex_27072024;

public class Lab143 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        // array values
        int[] a = new int[4];
        //disadvantage of arrray
        //1. fixed data type (homogenous data)
        //2, fixed length - can't be changed
        //3. wastage of memory
        int[] ages = new int[100];
        ages[1] = 99;
        ages[1]=100;
        System.out.println(ages[1]);
        //0, 2 - 99 memory wastage
    }
}
