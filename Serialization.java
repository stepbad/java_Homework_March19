import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class Employee implements java.io.Serializable {
	String firstname;
	String lastname;
}

public class Serialization {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstname = "Vivekanand";
		emp.lastname = "Gautam";

		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in ./employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
