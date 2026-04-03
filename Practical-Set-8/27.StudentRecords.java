import java.io.*;

public class StudentRecords {
    public static void main(String[] args) {
        File file = new File("students.txt");

        // Part 1: Writing to the file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("101, Hani, 85\n");
            writer.write("102, Rahul, 90\n");
            writer.write("103, Priya, 88\n");
            System.out.println("Records written to " + file.getName());
        } catch (IOException e) {
            System.out.println("Error writing: " + e.getMessage());
        }

        // Part 2: Reading from the file
        System.out.println("\n--- Student Records ---");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        } finally {
            System.out.println("Process Completed.");
        }
    }
}
