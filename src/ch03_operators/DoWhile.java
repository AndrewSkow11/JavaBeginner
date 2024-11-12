package ch03_operators;

public class DoWhile {
    public static void main(String[] args) {
        int num = 100;

        // один раз в любом случае выполнится
        do {
            System.out.println("Используем DoWhile: " + num);
            num += 10;
        } while (num < 0);
    }
}
