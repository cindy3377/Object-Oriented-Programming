package library.model;

import java.util.List;
import java.util.ArrayList;

public class LibraryMember {
        private String name;
        private int memberId;
        ArrayList <Book> borrowedBooks = new ArrayList<>();
        public LibraryMember(String name, int memberId){
            this.name = name;
            this.memberId = memberId;
        }
        public String getName() {
            return name;
        }
        public int getMemberId() {
            return memberId;
        }
        public List<Book> getBorrowedBooks() {
            return borrowedBooks;
        }

        public void borrowBook(Book book) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        }

        public void returnBook(Book book) {
            borrowedBooks.remove(book);
            System.out.println(name + " returned the book: " + book.getTitle());
        }
}
