package ex_13072024;

public class Lab023 {
    public static void main(String[] args) {
        System.out.println("9x1=9");
        System.out.println("9x2=18");
        System.out.println("9x10=90");
        //not good way
        //formatting
        int age = 98;
        System.out.println("your age is ->" +age);
        System.out.printf("your age is -> %d", age); //formatting
        //%d -> any integer - byte, int, long
        //%s -> string
        //%c -> char
        //%f -> float
        System.out.printf("your age is -> %d", age); //replacing of value
        //use format a code
    }
}
