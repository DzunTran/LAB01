package lab_06;

public class CalculateMinute {

    public static void main(String[] args) {

        String string = "2 hours and 5 minutes";
        String[] splitString = string.split("and");
        String Hours = splitString[0];
        String Minutes = splitString[1];

        String HoursnumOnly = Hours.replaceAll("[^0-9]","");
        String MinsnumOnly = Minutes.replaceAll("[^0-9]","");

        int Hoursnum = Integer.parseInt(HoursnumOnly);
        int Minsnum = Integer.parseInt(MinsnumOnly);
        System.out.println("The total in minutes is: " + ((Hoursnum*60)+Minsnum));
    }
}
