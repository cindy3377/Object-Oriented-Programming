package library.system;

import library.model.LibraryMember;
import library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)){
            member.borrowBook(book);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (members.contains(member) && member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
        } else {
            System.out.println("Book return unsuccessful. Check member or book availability.");
        }
    }
}
