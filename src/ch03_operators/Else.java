package ch03_operators;

public class Else {
    public static void main(String[] args) {
        int hours = 19;
        if (hours < 13) System.out.println("Доброе утро!\nВремя: "
                + hours + " часов");
        else if (hours < 18) {
            System.out.println("Добрый день!\nВремя: "
                    + hours + " часов");
        }
        else System.out.println("Добрый вечер!\nВремя: "
                    + hours + " часов");
    }
}
