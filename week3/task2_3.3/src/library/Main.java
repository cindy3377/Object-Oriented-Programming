package library.Main;

import library.model.LibraryMember;
import library.model.Book;
import system.Library;
public class Main {

    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        // Add books and members to the library
        // Perform borrowing and returning operations
        Book book1 = new Book("Gone with the wind", "Margaret Mitchell", 123-4-123-45678-9);
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 123-5-123-45678-9);
        Book book3 = new Book("Sans Famille", "Hector Malot", 123-6-123-45678-9);

        Library library = new Library();
        LibraryMember member1 = new LibraryMember("Trang", 1);
        LibraryMember member2 = new LibraryMember("Vu", 2);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        library.borrowBook("Sans Famille");

        library.returnBook(book2);
    }
}
