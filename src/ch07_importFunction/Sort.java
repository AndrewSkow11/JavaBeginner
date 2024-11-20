package ch07_importFunction;

import ch04_data.Array;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        String[] names = {"Майк", "Дэйв", "Энди"};
        int[] numbers = {200, 300, 100};
        display(names);
        display(numbers);

        System.out.println("\nСортированный массивы");
        Arrays.sort(names);
        Arrays.sort(numbers);

        display(names);
        display(numbers);
    }

    public static void display(String[] elements) {
        System.out.println("\nСтроковый массив:");
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("Элемент %d - %s\n", i, elements[i]);
        }
    }

    public static void display(int[] elements) {
        System.out.println("\nЦелочисленный массив:");
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("Элемент %d - %s\n", i, elements[i]);
        }
    }


}
