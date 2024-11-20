package ch05_data2;

public class CharacterSwap {
    public static void main(String[] args) {
        String txt = "";
        if (txt.isEmpty()) txt = "   Smth in the street   ";
        System.out.println("Строка: " + txt);
        System.out.println("Длина первоначальной строки: " + txt.length());
        System.out.println("\nПрименение метода trim() для удаления пробелов в начале и конце строки");
        txt = txt.trim();
        System.out.println("Строка: " + txt);
        System.out.println("Длина преобразованной строки: " + txt.length());
        System.out.println("\nПервая буква строки: " + txt.charAt(0));
        System.out.println("Последняя буква строки: " + txt.charAt(txt.length() - 1));
        txt = txt.replace(' ', '_');
        System.out.println("Замена пробелов на подчёркивание: " + txt);

    }
}
