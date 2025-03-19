import java.io.Serializable;

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(String name, double a, double b) {
        super(name);
        if (a >= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }
}