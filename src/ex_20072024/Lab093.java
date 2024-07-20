package ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        //web automation
        // ask user browser name
        Scanner sc = new Scanner(System.in);
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch(browserName) {
            case "chrome":
                System.out.println("Starting chrome");
                break;
        }

    }
}
