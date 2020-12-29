package Homework_1.Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    public String getName() {
        return name;
    }

    private String name;

    public List<T> getList() {
        return list;
    }

    private List<T> list;

    int getNumb() {
        return list.size();
    }

    public Box(T...o) {
        list = Arrays.asList(o);
    }

    public Box(String name) {
        try {
        list = new ArrayList<T>();
        this.name = name;}
        catch (UnsupportedOperationException e) {
            System.out.println("The box must have a name");
        }
    }

    void addFruits(T o) {
        list.add(o);
    }

    void replace(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void getInfo() {
        try {
        if(list.isEmpty()) {
            System.out.println("There is nothing in the box " + getName() + " yet");
        }
        else {
            System.out.println(("The box " + getName() +  " contains " + list.size() + " " + list.get(0).toString() + "(s)."));
        }

    } catch (UnsupportedOperationException e) {
            System.out.println(e + "\"The box must have a name.\"");
            System.out.println("The box must have a name.");
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        }
        else {
            System.out.println("The box " + getName() + " is " + (list.size() * list.get(0).getWeight()) + " kilos.");
            return list.size() + list.get(0).getWeight();
        }
    }

    void compare(Box<? extends Fruit> another) {
        System.out.println("The weights of " + this.getName() + " " + another.getName() + " is equal: " + (this.getWeight() == another.getWeight()));
    }
}
