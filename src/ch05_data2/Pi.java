package ch05_data2;

public class Pi {
    public static void main(String[] args) {
        float radius = Float.parseFloat(args[0]);
        float shortPi = (float) Math.PI;

        float circ = shortPi * (radius + radius);
        float area = shortPi * radius * radius;

        System.out.print("Если число П рассчитано в диапазоне от: "+ Math.PI);
        System.out.println(" до " + shortPi + "...");
        System.out.printf("Окружность с радусом %f см " +
                "имеет длину %f см " +
                "и площадь %f кв.см", radius, circ, area);
    }
}
