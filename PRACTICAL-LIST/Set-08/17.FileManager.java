import java.io.*;
import java.nio.file.*;
import java.util.Date;

/**
 * File management utility demonstrating File I/O and properties.
 * Usage: 
 * java FileManager copy source.txt dest.txt
 * java FileManager delete file.txt
 * java FileManager rename old.txt new.txt
 */
public class FileManager {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileManager <command> <file1> [file2]");
            System.out.println("Commands: copy, delete, rename");
            return;
        }

        String command = args[0].toLowerCase();
        String path1 = args[1];

        try {
            switch (command) {
                case "copy":
                    if (args.length < 3) throw new Exception("Destination file missing.");
                    copyFile(path1, args[2]);
                    break;

                case "delete":
                    deleteFile(path1);
                    break;

                case "rename":
                    if (args.length < 3) throw new Exception("New name missing.");
                    renameFile(path1, args[2]);
                    break;

                default:
                    System.out.println("Unknown command: " + command);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void copyFile(String src, String dest) throws IOException {
        File source = new File(src);
        File destination = new File(dest);

        if (!source.exists()) throw new FileNotFoundException(src);

        // Using Files utility for efficient copy
        Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully.");
        printProperties(destination);
    }

    private static void deleteFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            printProperties(file); // Show properties before deletion
            if (file.delete()) {
                System.out.println("File '" + path + "' deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            throw new FileNotFoundException(path);
        }
    }

    private static void renameFile(String oldName, String newName) throws IOException {
        File oldFile = new File(oldName);
        File newFile = new File(newName);

        if (!oldFile.exists()) throw new FileNotFoundException(oldName);

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
            printProperties(newFile);
        } else {
            System.out.println("Rename failed. Ensure the new name isn't already taken.");
        }
    }

    private static void printProperties(File f) {
        System.out.println("\n--- File Properties ---");
        System.out.println("Name:          " + f.getName());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        System.out.println("Size:          " + f.length() + " bytes");
        System.out.println("Readable:      " + (f.canRead() ? "Yes" : "No"));
        System.out.println("Writable:      " + (f.canWrite() ? "Yes" : "No"));
        System.out.println("Last Modified: " + new Date(f.lastModified()));
        System.out.println("-----------------------\n");
    }
}
