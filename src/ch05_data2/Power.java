package ch05_data2;

public class Power {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        int sqrt = (int) Math.sqrt(num);

        System.out.println(num + " в квадрате равно " + square);
        System.out.println(num + " в кубе равно " + square);
        System.out.println("Квадратный корень из " + num + " равен " + sqrt);


    }
}
