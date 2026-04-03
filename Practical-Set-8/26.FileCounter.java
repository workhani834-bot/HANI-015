import java.io.*;

public class FileCounter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the filename as a command-line argument.");
            return;
        }

        int charCount = 0, wordCount = 0, lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
