package Vererbung_Teil1.geometry;

public abstract class Shape {

    protected Color fill = Color.Black;
    protected Point position= new Point (0,0);

    protected abstract double calculateArea();
    protected abstract double calculateCircumference();

    protected Color getFill(){
        return fill;
    }

    protected void setFill(Color fill){
        this.fill = fill;
    }

    protected Point getPosition(){
        return position;
    }

    protected void setPosition (Point position){
        this.position = position;
    }
}
