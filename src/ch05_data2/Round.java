package ch05_data2;

public class Round {
    public static void main(String[] args) {
        // Math.floor () - до ближайшего целого вниз, возвращает double
        // Math.celi() - до ближайшего целого вверх, возвращает double
        // Math.round() - округляет до ближайшего целого, возвращает int


        float num = 7.25f;
        System.out.println(num + " округление равно " + Math.round(num));
        System.out.println(num + " округление вниз " + Math.floor(num));
        System.out.println(num + " округление вверх " + Math.ceil(num));

    }
}
