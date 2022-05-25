package lesson3;

public class ArrayPrePostfix {

    public static void main(String[] args) {
        int arrayLength = 5;
        int [] myIntArray = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = index++;
        }

        for (int index = 0; index < myIntArray.length; index++) {
            System.out.printf("Element at the index %d has value %d\n", index, myIntArray[index]);
        }

            System.out.printf("========");

            //Enhance for
            for (int elementValue : myIntArray) {
                System.out.println(elementValue);

            }
        }
    }