package ch05_data2;

public class StringComparison {
    public static void main(String[] args) {
        String password = "bingo";
        try {
            if (args[0].toLowerCase().equals(password)) System.out.println("Пароль подтверждён!");
            else System.out.println("Неверный пароль");
        } catch (Exception e) {
            System.out.println("Требуется ввод пароля");
        }
    }
}
