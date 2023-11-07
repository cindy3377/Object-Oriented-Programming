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
class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                user.borrowBook(book);
                books.remove(book);
                System.out.println("\nBook borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("\nBook not found: " + title);
    }

    public void displayUsersAndBorrowedBooks() {
        System.out.println("\nLibrary Users and Their Borrowed Books:");
        for (User user : users) {
            System.out.println("User: " + user.getName() + ", Age: " + user.getAge());
            System.out.println("Borrowed Books:");
            for (Book book : user.getBorrowedBooks()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("Trang", 25);
        User user2 = new User("Micheal", 30);

        library.addUser(user1);
        library.addUser(user2);

        Book book1 = new Book("Gone with the wind", "Margaret Mitchell", 1936);
        Book book2 = new Book("War and peace", "Leo Tolstoy", 1865);

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook("Gone with the wind", user1);
        library.borrowBook("War and peace", user2);

        library.displayUsersAndBorrowedBooks();
    }
}
