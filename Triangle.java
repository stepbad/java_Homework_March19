public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle");
        }
    }

    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double computeArea() {
        double s = computePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}