import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkOutBook(String title) {
        Book book = getBookByTitle(title);
        if (book != null) {
            book.toggleAvailability();
        }
    }

    public void returnBook(String title) {
        Book book = getBookByTitle(title);
        if (book != null) {
            book.toggleAvailability();
        }
    }

    public Book getBookByTitle(String title) {
        // Implement the method to find the book object by its title
        // This example assumes a simple linear search
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

class Book {
    private String title;
    private Author author;
    private boolean isAvailable;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void toggleAvailability() {
        this.isAvailable = !this.isAvailable;
    }
}

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Author One");
        Author author2 = new Author("Author Two");

        // Create books
        Book book1 = new Book("Book One", author1);
        Book book2 = new Book("Book Two", author2);

        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Check out a book
        library.checkOutBook("Book One");

        // Return a book
        library.returnBook("Book One");

        // Print available books
        System.out.println("Available books:");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book.getTitle());
        }
    }
}