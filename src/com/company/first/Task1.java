package com.company.first;

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

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(6,4,6,8,1,100,-100));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,8,76544, -42, 100,1));


        System.out.println(returnSame(list1, list2));
    }

    public static List<Integer> returnSame(List<Integer> list1, List<Integer> list2){
        if(list1 == null || list2 == null)
            return null;

        list1.removeIf(n -> !list2.contains(n));
        Collections.sort(list1);
        return list1;
    }
}
