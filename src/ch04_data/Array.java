package ch04_data;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] str = {"Java", "Хороший", "Язык"};
        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;
        str[1] = "Лучший";
        System.out.println("Размер строкового массива: " + str.length);
        System.out.println("Размер целочисленного массива: " + str.length);
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(num));

    }
}
