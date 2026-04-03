import java.io.*;

public class DataAnalyzer {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                // Count characters excluding spaces
                String cleanLine = line.replaceAll("\\s", "");
                characters += cleanLine.length();

                // Count words
                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
            }
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters (no spaces): " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("Error: data.txt not found. Create it first!");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
