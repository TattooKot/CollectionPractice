package main.java.com.tattookot.javacore;

/*
Необходимо реализовать анализатор текста, который принимает строку и проверяет, что у неё закрыты все открытые скобки

Пример:
“[({})]” - корректно
“[(){}” - не корректно
 */

public class StringAnalyzer {
    public static void main(String[] args) {

        System.out.println(analyzer("[({})]"));
        System.out.println(analyzer("[(){}"));

    }

    public static boolean analyzer(String s) {
        if(s == null)
            throw  new IllegalArgumentException();

        if(s.contains("[") && !s.contains("]"))
            return false;

        if(s.contains("(") && !s.contains(")"))
            return false;

        if(s.contains("{") && !s.contains("}"))
            return false;

        return true;
    }
}
