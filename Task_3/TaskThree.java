package Homework_1.Task_3;

public class TaskThree {
    public static void main(String[] args) {
        Box<Apple> appleB1 = new Box("Apple Box 1");
        Box<Apple> appleB2 = new Box("Apple Box 2");
        Box<Orange> orangeB1 = new Box("Orange Box 1");
        Box<Orange> orangeB2 = new Box("Orange Box 1");


        for (int i = 0; i < 10; i++) {
            appleB1.addFruits(new Apple());
        }

        for (int i = 0; i < 8; i++) {
            orangeB1.addFruits(new Orange());

        }

        appleB1.getInfo();
        orangeB1.getInfo();

        for (int i = 0; i < appleB1.getNumb(); i++) {
            appleB1.replace(appleB2);
        }

        appleB1.getInfo();
        appleB2.getInfo();
        appleB2.getWeight();
        appleB1.getWeight();
        orangeB1.getWeight();

        appleB2.compare(orangeB1);
    }
}
