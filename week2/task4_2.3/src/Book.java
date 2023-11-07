import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }
}


class Library {
    private ArrayList<Book> books = new ArrayList();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.printf("%d. Title: \"%s\", Author: \"%s\", Year: %d%n", i + 1, book.getTitle(), book.getAuthor(), book.getPublicationYear());
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("\nBook borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("\nBook not found: " + title);
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("\nBook returned: " + book.getTitle());
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
}
class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Gone with the Wind", "Margaret Mitchell", 1936);
        book1.setRating(4.5);
        book1.addReview("Great book!");
        book1.addReview("Highly recommended.");

        Book book2 = new Book("War and Peace", "Leo Tolstoy", 1865);
        book2.setRating(4.0);
        book2.addReview("Very descriptive.");
        book2.addReview("A bit long.");

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

        String checkbook = "Gone with the Wind";
        boolean isAvailable = library.isBookAvailable(checkbook);
        if (isAvailable) {
            System.out.println("\nThe book is available.");
        } else {
            System.out.println("\nThe book is not available.");
        }

        ArrayList<String> reviews = book1.getReviews();

        System.out.println("Book Reviews:");
        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }
}


