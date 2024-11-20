package ch06_classes;

public class SubClass extends SuperClass {


    public static void main(String[] args) {
        hello();
        SuperClass.hello();

        try {
            echo(args[0]);
        }
       catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }


    public static void hello() {
        System.out.println("Привет из Подкласса");
    }
}
