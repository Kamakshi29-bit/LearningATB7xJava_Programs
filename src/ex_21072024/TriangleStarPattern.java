package ex_21072024;

public class TriangleStarPattern {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
