package Lab_02;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = scanner.nextInt();

        boolean calNum = num % 2 == 0;
        String msg = calNum? "Even Number" : "Odd Number";
        System.out.println(msg);
    }
}
