package ch06_classes;

public class SuperClass {



    public static void hello(){
        System.out.println("Привет из суперкласса");
    }

    public static void echo (String arg) {
        try {
            System.out.println("Вы ввели: " + arg);
        }
        catch (Exception e) {
            System.out.println("Требуется аргумент!");
        }

    }

}
