package ch03_operators;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                if (i==1 && j==1) {
                    System.out.printf("Продолжение работы внутреннего цикла при i=%d, j=%d\n", i, j);
                    continue;
                }

                if (i == 2 && j == 1) {
                    System.out.printf("Выход из внутреннего цикла, где i=%d, j=%d\n", i, j);
                    break;
                }


                System.out.printf("Итерация i=%d, j=%d\n", i, j);
            }
        }
    }
}
