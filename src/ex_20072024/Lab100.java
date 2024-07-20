package ex_20072024;

public class Lab100 {
    public static void main(String[] args) {
        //switch never return anything
        //just execute
        //after jd>13 -> return
        char code ='A';
        char code = 'B';
        int val = switch (code){
            case 'A':
                yield  65; //return
            case 'B':
                yield 66;
            default:
                throw new IllegalAccessException("Unexpected")
        };
        System.out.println(val);
    }
}
