package lab_03;

public class SortMinMax {
    public static void main(String[] args) {

        int[] arrayNum = {9, 8, 9, 4, 5, 2, 1, 5, 7, 11, 18, 19, 100, 200, 301, 500, 600, 1111};
        int i = 0;
        int Num = 0;

        while (i < arrayNum.length) {
            for (int index = i; index < arrayNum.length; index++) {
                if (arrayNum[index] < arrayNum[i]) {
                    Num = arrayNum[i];
                    arrayNum[i] = arrayNum[index];
                    arrayNum[index] = Num;
                }
                i++;
            }
        }

        System.out.print("Value from min to max: ");
        for (int numValue : arrayNum) {
            System.out.print(numValue + ", ");
        }
    }
}

