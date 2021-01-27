package Vererbung_Teil1.geometry;

public class Rectangle extends Shape{

    private int width;
    private int height;
    //private Point position;
    //private Color fill;

    public Rectangle(Point topLeft, int width, int height) {
        this.position = topLeft;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point getPosition() {
        return position;
    }

    @Override
    public double calculateArea() {
        double fläche = height * width;
        return fläche;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + height);
    }


    public Color getFill() {
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }
}
