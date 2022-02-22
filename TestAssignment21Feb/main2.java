package com.org.gen.TestAssignment21Feb;
import java.util.Scanner;
class UserMainCode1 {
    static int validatePassword(String a) {
        int d = 0;
        if (a.length() >= 8) {
            if (a.contains("#") || a.contains("@") || a.contains("_")) {
                char c = a.charAt(0);
                if (Character.isAlphabetic(c)) {
                    char dd = a.charAt(a.length() - 1);
                    if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd))) {

                        return 1;

                    }

                }

            }

        }

        return -1;
    }

}
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (UserMainCode1.validatePassword(a) == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
