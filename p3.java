import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

        String fileName = "sample.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a Java file handling program.\n");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("\nContents of the file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
