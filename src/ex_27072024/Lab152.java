package ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        //String - imutable in nature
        //StringBuilder, StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        //change the vlue of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        //Thead safety?
        //stringBuilder - not thread safe - people Love it :)
    }
}
