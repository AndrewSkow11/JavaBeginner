package ch07_importFunction;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("\nСейчас: " + date);
        date = date.withYear(2018);
        System.out.println("Изменённая дата: " + date);
        System.out.println("\nПоля объекта LocalDateTime:");
        System.out.println("Год: " + date.getYear());
        System.out.println("Номер месяца: " + date.getMonthValue());
        System.out.println("День недели: " + date.getDayOfWeek());
        System.out.println("День месяца: " + date.getDayOfMonth());
        System.out.println("День в году: " + date.getDayOfYear());
        System.out.println("Час: " + date.getHour());
        System.out.println("Минута: " + date.getMinute());
        System.out.println("Секунда: " + date.getSecond());



    }
}
