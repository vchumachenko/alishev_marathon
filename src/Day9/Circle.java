package Day9;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }


    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}
