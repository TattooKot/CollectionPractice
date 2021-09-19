package main.java.com.tattookot.javacore;

/*
Необходимо реализовать алгоритм, который принимает на вход две коллекции целых чисел
и возвращает отсортированную коллекцию, содержащую общие элементы.
Пример:
[6,4,6,8,1,100,-100], [3,8,76544, -42, 100,1]
Результат:
[1,8,100]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(6,4,6,8,1,100,-100));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,8,76544, -42, 100,1));


        System.out.println(returnSame(list1, list2));
    }

    public static List<Integer> returnSame(List<Integer> listToComparing, List<Integer> elements){
        if(listToComparing == null || elements == null)
            return null;

        listToComparing.removeIf(n -> !elements.contains(n));
        Collections.sort(listToComparing);
        return listToComparing;
    }
}
