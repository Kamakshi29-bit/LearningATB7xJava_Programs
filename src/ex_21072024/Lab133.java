package ex_21072024;

public class Lab133 {
    public static void main(String[] args) {
        //fizzbuzz problem - hacker rank
        //print num 1 to 100
        // for multiple of 3, print "Fizz
        //for multi of 5, print "Buzz"
        //for numbers multi of both 3 and 5
        //print "FizzBuzz"
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else
            if(i%3==0){
                System.out.println("Fizz");
            }else
            if(i%5==0){
                System.out.println("Buzz");
            }else
            {
                System.out.println(i);
            }
        }
    }
}
