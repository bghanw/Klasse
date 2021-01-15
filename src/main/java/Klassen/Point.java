package Klassen;

public class Point {

    //<TODO>
    static int x;
    static int y;

    static int setX(int x) {
        Point.x = x;
        return x;
    }

    static int setY(int y) {
        Point.y = y;
        return y;
    }

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }

    static int getX() {
        return Point.x;
    }

    static int getY() {
        return Point.y;
    }

}
