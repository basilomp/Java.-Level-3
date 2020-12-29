package Homework_1.Task_2;

import java.util.Arrays;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        String[] list = {"a", "b", "c", "d", "e", "f", "g"};
        List<String> arr = arrayAsList(list);
        System.out.println(arr.getClass());

    }


    public static <E> List<E> arrayAsList (E[] arr) {
        return Arrays.asList(arr);
    }
}
