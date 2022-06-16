package lab_08_02;

public class AnimalController {

    public static void main(String[] args) {

        Animal Horse = new Animal(75, "horse");
        Animal Tiger = new Animal(100, "Tiger");
        Animal Dog = new Animal(60, "Dog");

        Animal.result(Horse,Tiger,Dog);
    }
}
