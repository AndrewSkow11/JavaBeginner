package ch02_operations;

public class Assignment {
    public static void main(String[] args) {
        String txt = "Fantastic ";
        String lang = "Java";
        txt += lang;
        System.out.println("Скаладываем и присваиваем строки: " + txt);

        int sum = 10;
        int num = 20;
        sum += num;
        System.out.println("Складываем и присваиваем целые числа: " + sum);

        int factor = 5;
        sum *= factor;
        System.out.println("Результат умножения: " + sum);

        sum /= factor;
        System.out.println("Результат деления: " + sum);

    }
}
