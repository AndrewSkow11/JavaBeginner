package ch02_operations;

public class Precedence {
    public static void main(String[] args) {
        int sum = 32 - 8 + 16 * 2;
        System.out.println("Порядок действий по умолчанию: " + sum);
        sum = (32 - 8 + 16) * 2;
        System.out.println("Указан " +
                "порядок действий с помощью скобок: " + sum);
        sum = (32 - (8 + 16)) * 2;
        System.out.println("Указан " +
                "порядок действий с помощью скобок ещё: " + sum);


    }
}
