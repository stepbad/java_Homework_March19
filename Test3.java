import java.io.*;

public class Test3 {

    public static void main(String[] args) {

        // Name of the file to open
        String fileName = "xyz.txt";

        // Variable to store each line
        String line = null;

        // Counter for total characters
        int totalChars = 0;

        try {
            // FileReader reads text files
            FileReader fileReader = new FileReader(fileName);

            // BufferedReader wraps FileReader for efficiency
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Add the number of characters in the line to the total count
                totalChars += line.length();
            }

            // Close the BufferedReader
            bufferedReader.close();

            // Display the total number of characters
            System.out.println("Total characters in file '" + fileName + "': " + totalChars);
        }
        catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }
}
