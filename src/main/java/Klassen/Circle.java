package Klassen;

public class Circle {

    public static void main(String[] args) {

        int radius = 5;
        double area = calculateArea(radius);
        System.out.println("Kreisfläche bei Radius 5 cm: " + area + "cm");

        double circumference = calculateCircumference(5);
        System.out.println("Kreisumfang Radius 5cm: " + circumference + "cm");

    }

    static double calculateArea(int radius) {
        double area = Math.pow(radius,2) * Math.PI; // or--> radius * radius * Math.PI;
        return area;
    }

    static double calculateCircumference(int radius) {
        double circumference = (2 * radius) * Math.PI; // or---> 2 * Math.PI * radius;
        return circumference;
    }


}
