package ch06_classes;

public class SafeInstance {

    public static void main(String[] args) {
        NewCar Posrshe = new NewCar();
        Posrshe.setCar("Porshe", "красный", "купе");
        Posrshe.getCar();

        NewCar Bentley = new NewCar();
        Bentley.setCar("Bentley", "Зелёный", "Седан");
        Bentley.getCar();
    }


}
