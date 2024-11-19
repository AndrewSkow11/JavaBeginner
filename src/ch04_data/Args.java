package ch04_data;

public class Args {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Неверно число аргументов!");
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        String msg = args[0] + args[1] + args[2] + "=";

        if (args[1].equals("+")) msg += (num1 + num2);
        else if (args[1].equals("-")) msg += (num1 - num2);
        else if (args[1].equals("*")) msg += (num1 * num2);
        else if (args[1].equals("/")) msg += (num1 / num2);
        else System.out.println("Неверный оператор");

        System.out.println(msg);
    }
}
