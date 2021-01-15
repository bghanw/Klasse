package Klassen;

public class Rectangle {

    public static void main(String[] args) {

        double width = 4;
        double height = 5;

        double fläche = calculateArea(width, height);
        System.out.println("Fläche " + fläche);

        double umfang = calculateCumference(width, height);
        System.out.println("Umfang " + umfang);

    }

    static double calculateArea(double width, double height) {
        double fläche = height * width;
        return fläche;
    }

    static double calculateCumference(double width, double height) {
        return 2 * (width + height);
    }
}
