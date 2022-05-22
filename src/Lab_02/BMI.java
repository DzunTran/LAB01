package Lab_02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the weight: ");
        float yourWeight = scanner.nextFloat();
        System.out.println("Please input the height: ");
        float yourHeight = scanner.nextFloat();

        float BMI = yourWeight / (yourHeight * 2);
        if (BMI < 18.5){
            System.out.println("BMI: " + BMI);
            System.out.println("Underweight ");
        }
        else if (BMI <= 24.9) {
            System.out.println("BMI: "+ BMI);
            System.out.println("Normal weight");
        }
        else if (BMI <= 29.9) {
            System.out.println("BMI: "+ BMI);
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obesity");
        }

    }
}
