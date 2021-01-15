package Klassen;

import javax.swing.*;

public class Line {

    public static void main(String[] args) {


        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 4;
        double distance = Line.calculateDistance(1, 1, 4, 4);
        System.out.println("Distance: " + distance);

    }

    static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
