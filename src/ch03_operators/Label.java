package ch03_operators;
// возврат управления

public class Label {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                if (i == 2 && j == 3) {
                    System.out.printf("Выход из outerLoop при i==%d, j==%d\n", i, j);
                    break outerLoop;
                }

                if (i == 1 && j == 1) {
                    System.out.printf("outerLoop продолжает работы при i==%d, j==%d\n", i, j);
                    continue outerLoop;
                }

                System.out.printf("Итерация i==%d, j==%d\n", i, j);
            }
        }
    }
}
