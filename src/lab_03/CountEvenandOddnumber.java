package lab_03;

public class CountEvenandOddnumber {
    public static void main(String[] args) {

        int [] array = {9,8,9,4,5,2,1,5,7,11,18,19,100,200,301};
        int EvenNum = 0;
        int OddNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                EvenNum++;
            }
            else
                OddNum++;
        }
        System.out.printf("Even numbers: %d\n", EvenNum);
        System.out.printf("Odd numbers: %d", OddNum);
    }
}
