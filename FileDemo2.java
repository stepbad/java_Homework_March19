import java.io.*;

public class FileDemo2 {

	public static void main(String[] args) {

		String path = "";
		boolean bool = false;

		try {
			// creating new file
			File file = new File("testFile1.txt");
			file.createNewFile();
			System.out.println(file);

			// creating canonical form from file object
			File file2 = file.getCanonicalFile();

			// returns true if the file exists
			System.out.println(file2);
			bool = file2.exists();

			// returns absolute pathname
			path = file2.getAbsolutePath();
			System.out.println(bool);

			// if file exists
			if (bool) {
				// prints
				System.out.print(path + " Exists? " + bool);
			}

		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		}
	}
}
