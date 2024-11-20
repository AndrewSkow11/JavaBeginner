package ch06_classes;

public class Constructor {
    public static void main(String[] args) {
        NewCar Porsche = new NewCar();
        Porsche.getCar();


        NewCar Ferrari = new NewCar();
        Ferrari.setCar("Ferrari", "Красный", "Спортивный");
        Ferrari.getCar();
    }
}
