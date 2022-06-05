package lab_06;

import java.util.Scanner;

public class Input3times {

    public static void main(String[] args) {

        String myPassword ="password123";
        int TotalAttempt = 3;

        while (TotalAttempt > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the password: ");
            String Password = scanner.next();
            if (Password.equals(myPassword)) {
                System.out.println("Login successfully!!!");
                return;
            } else {
                System.out.println("Password is not valid");
                TotalAttempt--;
            }
            if (TotalAttempt == 0) {
                System.out.println("You have failed to login 3 times!!!");
            }
        }
    }
}
