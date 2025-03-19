package src.de.vogella.java.serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		String filename = "time.ser";
		Person p = new Person("Lars", "Vogel");

		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fos);

			out.writeObject(p);
			out.close();
			fos.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Deserialize (read) the object from file
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fis);

			p = (Person) in.readObject();

			in.close();
			fis.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(p);
	}
}
