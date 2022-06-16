package lab_08_02;

import java.security.SecureRandom;

public class Animal {

    private int Speed;
    private String Name;

    public Animal(int maxSpeed, String name) {
        Speed = getSpeed(maxSpeed);
        Name = name;
    }

    public int getSpeed(int maxSpeed) {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        return randomSpeed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void result(Animal a, Animal b, Animal c){
        Animal list[] = {a,b,c};
        Animal temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i+1; j < list.length ; j++) {
                if (list[i].Speed > list[j].Speed) {
                    temp = list[i];
                    list[i]=list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].Name + ": " + list[i].Speed);
        }
        Animal Winner = list[list.length - 1];
        System.out.println("Winner is "+ Winner.Name+", with speed "+Winner.Speed);
    }
}
