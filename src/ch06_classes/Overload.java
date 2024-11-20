package ch06_classes;

public class Overload {
    public static void main(String[] args) {
        System.out.println(write(12));
        System.out.println(write("Двенадцать"));
        System.out.println(write(16, 4));
    }

    public static String write(int num) {
        return ("Переданное целое число: " + num);
    }

    public static String write(String num) {
        return ("Переданная строка: " + num);
    }

    public static String write(int num1, int num2) {
        return ("Переданы два целочисленных аргумента,\n" +
                "результат умножения аргументов: " + (num1 * num2));
    }


}
