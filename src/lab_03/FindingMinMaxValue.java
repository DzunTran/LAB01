package lab_03;

public class FindingMinMaxValue {

    public static void main(String[] args) {

        int[] newarray = {9, 8, 9, 4, 5, 2, 1, 5, 7, 11, 18, 19, 100, 200, 301, 500, 600, 1111};
        int min = newarray[0];
        int max = newarray[0];

        for (int element = 1; element < newarray.length; element++) {
            if (newarray[element] < min) {
                min = newarray[element];
            }
            if (newarray[element] > max) {
                max = newarray[element];
            }
        }
            System.out.printf("Minimum number is: %d\n", min);
            System.out.printf("Maximum number is: %d", max);
    }
}
        

