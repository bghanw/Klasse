package geometry;

public class PointApp {

    public static void main(String[] args) {

        Point.setX(4);
        Point.setY(5);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println("(" + x + "),(" + y + ")");
    }
}
