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

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("%d. Title: \"%s\", Author: \"%s\", Year: %d%n", i + 1, book.getTitle(), book.getAuthor(), book.getYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.printf("Books by Author \"%s\":%n", author);
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.printf("Title: \"%s\", Year: %d%n", book.getTitle(), book.getYear());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("Book borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }
}

class LibraryMain {
    public static void main(String[] args) {

        Book book1 = new Book("Gone with the wind", "Margaret Mitchell", 1936);
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 1865);
        Book book3 = new Book("Sans Famille", "Hector Malot", 1878);


        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.borrowBook("Sans Famille");
        library.displayBooks();

        library.returnBook(book2);
        library.displayBooks();
    }
}
