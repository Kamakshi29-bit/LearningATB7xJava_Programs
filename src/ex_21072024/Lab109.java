package ex_21072024;

public class Lab109 {
    public static void main(String[] args) {
        for(int i =0; i >= 1; i++){
            System.out.println(i);
        }
        //no condition - infinite loop
        //UNTIL CPU run out of memory
        for(int i =0; ; i++){
            System.out.println(i);
        }
    }
}
