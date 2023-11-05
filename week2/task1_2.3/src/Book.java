import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    public Book (String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return publicationYear;
    }
}


class Library {
    private ArrayList<Book> books = new ArrayList<>();
    //addBook(Book book): This method should add the given Book object to the
    // library's collection.
    public void addBook(Book book) {
        books.add(book);
    }
    //displayBooks(): This method should display the details of all books
    // in the library's collection, including their titles, authors, and publication years.
    public void displayBooks(){
        System.out.println("Book list:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("%d. Title: \"%s\", Author: \"%s\", Year: %d%n", i + 1, book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
    //findBooksByAuthor(String author): This method should search and display
    // the details of books written by the specified author.
    public void findBooksByAuthor(String author) {
        System.out.printf("\nBooks by author \"%s\":%n", author);
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.printf("Title: \"%s\", Year: %d%n", book.getTitle(), book.getYear());
            }
        }
    }
}

class LibraryMain {
    public static void main(String[] args) {
        // Create instances of Book representing different books.
        Book book1 = new Book("Gone with the wind", "Margaret Mitchell", 1936);
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 1865);
        Book book3 = new Book("Sans Famille", "Hector Malot", 1878);

        // Create an instance of Library.
        Library library = new Library();

        // Add the book instances to the library.
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display the list of all books in the library.
        library.displayBooks();

        // Search for books by a specific author and display the results.
        library.findBooksByAuthor("Hector Malot");
    }
}