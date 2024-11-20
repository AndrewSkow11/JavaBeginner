package ch07_importFunction;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

public class Formats {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("\nЧисло: " + nf.format(12345689));
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("Валюта: " + cf.format(1234.50f));
        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println("Проценты: " + pf.format(0.75f));
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy");
        System.out.println("Дата: " + now.format(df));
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
        System.out.println("Время: " + now.format(tf));

    }
}
