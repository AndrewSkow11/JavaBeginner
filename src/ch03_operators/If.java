package ch03_operators;

public class If {
    public static void main(String[] args) {

        if (5 > 1) System.out.println("five more than one");

        if (2 < 4) {
            System.out.println("two less than four");
            System.out.println("checking was completed successfully");
        }

        int num = 8;

        if (
                (num >5 ) && (num < 10) || (num < 12)
        ) System.out.printf("Число %d в диапазоне от 6 до 9 включенительно" +
                "или равно 12", num);


    }
}
