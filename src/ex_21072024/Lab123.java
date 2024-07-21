package ex_21072024;

public class Lab123 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            System.out.println(i);
            if(i%2==0){
                System.out.println("Even ->"+ i);
                continue;
            }
            //for 5 line 11 skip
            // continue means -> go back
            System.out.println("Odd ->"+ i);
        }
    }
}
