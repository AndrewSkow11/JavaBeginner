package ch02_operations;

public class Logic {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;

        System.out.println("Результат выражения yes И yes: " + (yes && yes));
        System.out.println("Результат выражения yes И no: " + (yes && no));

        System.out.println();

        System.out.printf("Результат выражения: %b or %b == %b\n", yes, yes, (yes || yes));
        System.out.printf("Результат выражения: %b or %b == %b\n", yes, no, (yes || no));
        System.out.printf("Результат выражения: %b or %b == %b\n", no, no, (no || no));

        System.out.println();

        System.out.printf("Первоначальное значение переменной yes = %b\n", yes);
        System.out.printf("Инвертированное значение переменной yes = %b\n", !yes);

    }
}
