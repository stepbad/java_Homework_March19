import java.io.*;

public class Demo3 {
	public static void main(String[] args) {
		// Create objects of various shapes
		Shape[] shapes = new Shape[4];
		shapes[0] = new Ellipse("Ellipse1", 10, 5);
		shapes[1] = new Circle("Circle1", 7);
		shapes[2] = new Triangle("Triangle1", 3, 4, 5);
		shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 6);

		// Loop through shapes array and print details
		for (Shape shape : shapes) {
			System.out.println(shape);
		}

		// Serialize (write) objects to a file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("shapes.ser"))) {
			out.writeObject(shapes);
			System.out.println("Shapes have been serialized to shapes.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
