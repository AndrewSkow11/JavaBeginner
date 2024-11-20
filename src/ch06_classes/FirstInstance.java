package ch06_classes;

public class FirstInstance {
    public static void main (String[] args) {
        Car Porshe = new Car();
        System.out.println("Цвет Porshe: " + Porshe.color);
        System.out.println("Цвет кузова Porshe: " + Porshe.bodyType);
        System.out.println(Porshe.accelerate());
    }
}
