package ch03_operators;

public class For {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("Внешний цикл i=" + i);
            for (int j = 1; j< 4; j++){
                System.out.printf("\tВнутренний цикл j==%d, \tnum==%d\n", j, (++num));
            }
        }

    }
}
