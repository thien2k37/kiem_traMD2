package Test;

import java.util.Scanner;

public class InputStringInteger {
    static Scanner sc = new Scanner(System.in);
    public static int checkInteger() {
        int test = 0;
        boolean check = false;
        do {
            try {
                String input = sc.nextLine();
                test = Integer.parseInt(input);
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại đi nhé !");
                System.out.println("-------------------------------");
            }
        }while (!check);
        return test;
    }
}
