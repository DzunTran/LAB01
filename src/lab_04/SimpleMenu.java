package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu {

    public static void main(String[] args) {

        printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select the number in the menu: ");
        int userInput = scanner.nextInt();
        List<Integer> myList = listNumber();

        switch (userInput){
            case 1:
                printAllNumber(myList);
                break;
            case 2:
                printAllNumber(myList);
                printMaxValue(myList);
                break;
            case 3:
                printAllNumber(myList);
                printMinValue(myList);
                break;
            case 4:
                printAllNumber(myList);
                searchNumber(myList);
                break;
            default:
                System.out.println("");
                break;
        }

    }
    private static void printAllNumber(List<Integer> myList){
        System.out.print("All the numbers that we have in the array list is: ");
        for (int number : myList) {
            System.out.print (number + " ");
        }
    }
    private static void printMenu(){
        System.out.print("==MENU==\n");
        System.out.print("1. Print all numbers\n");
        System.out.print("2. Print maximum value\n");
        System.out.print("3. Print minimum value\n");
        System.out.print("4. Search number\n");
    }
    private static List<Integer> listNumber(){
        System.out.print("Please input the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> myList = new ArrayList<>(length);
        for (int i = 0; i < length ; i++) {
            myList.add(getRandomNumber(1000));
        }
        return myList;
    }

    private static int getRandomNumber(int boundaryNumber){
        int randomNumber = new SecureRandom().nextInt(boundaryNumber);
        return randomNumber;
    }

    private static void printMaxValue(List<Integer> myList){

        int max = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (max < myList.get(i)) {
                max = myList.get(i);
            }
        }
        System.out.println("\nThe maximum number is: " + max);
    }
    private static void printMinValue(List<Integer> myList){

        int min = myList.get(0);
        for (int i = 0; i < myList.size(); i++) {
            if (min > myList.get(i)) {
                min = myList.get(i);
            }
        }
        System.out.println("\nThe minimum number is: " + min);

    }
    private static void searchNumber (List<Integer> myList){

        boolean exitsSearchNum = false;
        System.out.print("\nPlease input the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < myList.size(); i++) {
            if (number == myList.get(i)) {
                exitsSearchNum = true;
                System.out.printf("The number %d in the index %d", number, i);
                break;
            }
        }
        if(exitsSearchNum == false) {
            System.out.println("Number is not in the list!!!!!!");
        }
    }
}

