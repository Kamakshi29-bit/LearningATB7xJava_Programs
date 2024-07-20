package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        //JDK > 13
        int ITEMCODE = 007;
        switch(ITEMCODE){
            case 001,002,003:
                System.out.println("It is Electronic gadget");
                break;
            case 004,005,007:
                System.out.println("It is mechanical gadget");
                break;
            default:
                System.out.println("None");
        }

    }
}
