// Defining the custom exception class
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    public Library(int initialBooks) {
        this.availableBooks = initialBooks;
    }

    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println(count + " Book(s) issued successfully. Remaining: " + availableBooks);
        } else {
            // Throwing our custom exception
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library myLibrary = new Library(3); // Initializing with 3 books

        try {
            System.out.println("Attempting to issue 2 books...");
            myLibrary.issueBook(2); // Valid attempt

            System.out.println("Attempting to issue 2 more books...");
            myLibrary.issueBook(2); // This should trigger the exception

        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
