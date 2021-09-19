package com.company;

/*
Необходимо реализовать анализатор текста, который принимает строку и проверяет, что у неё закрыты все открытые скобки

Пример:
“[({})]” - корректно
“[(){}” - не корректно
 */

public class Task2 {
    public static void main(String[] args) {

        System.out.println(analyzer("[({})]"));
        System.out.println(analyzer("[(){}"));

    }

    public static boolean analyzer(String s) {
        if(s.contains("[") && !s.contains("]"))
            return false;

        if(s.contains("(") && !s.contains(")"))
            return false;

        if(s.contains("{") && !s.contains("}"))
            return false;

        return true;
    }
}
