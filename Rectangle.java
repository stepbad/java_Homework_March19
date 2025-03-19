import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Rectangle implements Serializable {

	private static final long serialVersionUID = 1L;

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		System.out.println("Area: " + (length * width));
	}

	public static void main(String[] args) {

		// Serialize the Rectangle object
		try {
			Rectangle r1 = new Rectangle(5, 6);
			r1.area();

			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(r1);
			out.flush();
			out.close();
			fout.close();

			System.out.println("Serialization successful.");

		} catch (Exception e) {
			System.out.println(e);
		}

		// Deserialize the Rectangle object
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Rectangle r2 = (Rectangle) in.readObject();

			System.out.println("Deserialized Rectangle dimensions:");
			System.out.println("Length: " + r2.length);
			System.out.println("Width: " + r2.width);

			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
