package ch04_data;

public class Options {
    public static void main(String[] args) {
        //args[0] = "-en";
        if (args[0].equals("-en")){
            System.out.println("Опция для Английского языка");
        }
        else if (args[0].equals("-eы")){
            System.out.println("Опция для Испанского языка");
        }
        else {
            System.out.println("Неизвестная опция");
        }
    }
}


