package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        //JDK>13
        // is use -> intead of : no break required
        int ITEMCODE = 001;
        switch (ITEMCODE){
            case 001 -> System.out.println("It is a laptop");
        }
    }
}