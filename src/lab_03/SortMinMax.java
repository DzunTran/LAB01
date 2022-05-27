package lab_03;

public class SortMinMax {
    public static void main(String[] args) {

        int[] arrayNum = {9, 8, 9, 4, 5, 2, 1, 5, 7, 11, 18, 19, 100, 200, 301, 500, 600, 1111};
        int temp;

        for (int i = 0; i < arrayNum.length - 1; i++) {
            for (int j = i + 1; j < arrayNum.length; j++) {
                if (arrayNum[i] > arrayNum[j]) {
                    temp = arrayNum[i];
                    arrayNum[i] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }
        System.out.println("Sort an integer array from min to max: ");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }
    }
}


