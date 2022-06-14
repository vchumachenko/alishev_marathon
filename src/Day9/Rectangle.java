package Day9;

public class Rectangle extends Figure {
    private int w;
    private int h;

    public Rectangle(String color, int w, int h) {
        super(color);
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }

    @Override
    public double perimeter() {
        return (w + h) * 2;
    }
}
