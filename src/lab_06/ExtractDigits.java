package lab_06;

public class ExtractDigits {

        public static void main(String[] args) {

            String myStr = "12345nabc678";
            char[] array = myStr.toCharArray();
            String numberResult = new String();

            for (int i = 0; i < array.length; i++) {
                if (Character.isDigit(array[i])) {
                    numberResult += (array[i]);
                }
            }
            System.out.println("The digit character from that String: " + numberResult);
        }
    }