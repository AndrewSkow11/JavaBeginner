package ch06_classes;

public class NewCar {
    private String maker;
    private String color;
    private String bodyType;


    public NewCar(){
        maker = "Porshe";
        color = "Серебристый";
        bodyType = "Купе";
    }

    private String accelerate() {
        String motion = "Ускорение ...";
        return motion;
    }

    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " цвет: " + color);
        System.out.println(maker + " тип кузова:  " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}
