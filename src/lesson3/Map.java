package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Map {

    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(3);
        myArray.add(4);
        myArray.add(4);
        myArray.add(4);

        List<Integer> withoutduplicate = new ArrayList<>();

        for (Integer num : myArray) {
            if(!withoutduplicate.contains(num)){
                withoutduplicate.add(num);
            }
        }
        System.out.println(myArray);
        System.out.println(withoutduplicate);
    }
}
