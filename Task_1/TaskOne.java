package Homework_1.Task_1;

import java.util.Arrays;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c", "d", "e", "f", "g"};
        System.out.println("Initial array: " + Arrays.toString(stringArray));
        swap(stringArray, 0,6);
        System.out.println("Resulting array: " + Arrays.toString(stringArray));


    }

    public static <T> void swap(T[] arr, int i, int j) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


}
