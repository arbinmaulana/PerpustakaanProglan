import java.util.ArrayList;

/**
 * Represents a book with a title.
 */
class Book {
    private String title;

    /**
     * Constructor for creating a Book object with a specified title.
     *
     * @param title The title of the book.
     */
    public Book(String title) {
        this.title = title;
    }

    /**
     * Retrieves the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }
}

/**
 * Represents a library that manages a collection of books.
 */
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * Adds a new book to the library.
     *
     * @param title The title of the book to be added.
     */
    public void addBook(String title) {
        Book book = new Book(title);
        books.add(book);
        System.out.println("Buku ditambahkan: " + title);
    }

    /**
     * Displays all books currently in the library.
     */
    public void showBooks() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).getTitle());
        }
    }

    /**
     * Removes the first book in the library collection.
     * Displays a message indicating the removed book or an error if no books are available.
     */
    public void removeBook() {
        if (books.size() > 0) {
            Book removedBook = books.remove(0);
            System.out.println("Buku dihapus: " + removedBook.getTitle());
        } else {
            System.out.println("Index tidak valid");
        }
    }

    /**
     * Replaces the current list of books with a new list.
     *
     * @param books An ArrayList of Book objects to set as the library's book collection.
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

/**
 * Main class to demonstrate the functionality of the Library class.
 */
class Main {

    /**
     * Main method to run the Library program.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Belajar Java");
        library.addBook("Pemrograman Berorientasi Objek");
        library.showBooks();
        library.removeBook();
        library.showBooks();
    }
}
