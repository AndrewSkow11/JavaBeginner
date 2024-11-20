package ch07_importFunction;

import java.io.*;

public class ReadString {
    public static void main(String[] args) {
        System.out.println("Введите название данной книги: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input = "";
        try {
            input = buffer.readLine();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода");
        }
        System.out.println("Спасибо, что читаете: " + input);
    }
}
