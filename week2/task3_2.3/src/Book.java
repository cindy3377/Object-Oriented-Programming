import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;


    public Book (String title, String author, int publicationYear) {
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
    public int getYear() {
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
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
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

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0; // No books in the library, return 0.
        }

        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }

        return totalRating / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null; // No books in the library, return null.
        }

        Map<Book, Integer> reviewCounts = new HashMap<>();

        for (Book book : books) {
            int numReviews = book.getReviews().size();
            reviewCounts.put(book, numReviews);
        }

        Book mostReviewedBook = null;
        int maxReviews = 0;

        for (Map.Entry<Book, Integer> entry : reviewCounts.entrySet()) {
            if (entry.getValue() > maxReviews) {
                maxReviews = entry.getValue();
                mostReviewedBook = entry.getKey();
            }
        }

        return mostReviewedBook;
}

class LibraryMain {
    public static void main(String[] args) {

        Book book1 = new Book("Gone with the wind", "Margaret Mitchell", 1936);
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

        double averageRating = library.getAverageBookRating();
        Book mostReviewedBook = library.getMostReviewedBook();

        library.displayBooks();

        library.borrowBook("Sans Famille");
        library.displayBooks();

        library.returnBook(book2);
        library.displayBooks();

        // Check if a book is available in the library
        String checkbook = "Gone with the wind";
        boolean isAvailable = library.isBookAvailable(checkbook);
        if (isAvailable) {
            System.out.println("\nThe book is available.");
        } else {
            System.out.println("\nThe book is not available.");
        }


        // Get the book's rating and reviews.
        double rating = book1.getRating();
        ArrayList<String> reviews = book1.getReviews();

        System.out.println("\nBook " + book1.getTitle() +" rating: " + rating);
        System.out.println("Book Reviews:");
        for (String review : reviews) {
            System.out.println("- " + review);
        }

        System.out.println("Average Book Rating: " + averageRating);
        if (mostReviewedBook != null) {
            System.out.println("Most Reviewed Book: " + mostReviewedBook.getTitle());
        } else {
            System.out.println("No books in the library.");
        }
    }
}
