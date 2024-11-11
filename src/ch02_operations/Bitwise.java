package ch02_operations;

public class Bitwise {
    public static void main(String[] args) {
        int number  = 53; // двоичное представление 00 11 01 01
        System.out.printf("Флаг 1: %s\n", ((number&1)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 2: %s\n", ((number&2)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 3: %s\n", ((number&4)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 4: %s\n", ((number&8)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 5: %s\n", ((number&16)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 6: %s\n", ((number&32)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 7: %s\n", ((number&64)>0) ? "ВКЛ" : "выкл");
        System.out.printf("Флаг 8: %s\n", ((number&128)>0) ? "ВКЛ" : "выкл");

    }
}
