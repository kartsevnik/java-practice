package Biblioteca;

import java.util.HashMap;

public class Biblioteca {

    HashMap<Integer, User> users = new HashMap<Integer, User>();
    HashMap<Integer, BookWithAmount> books = new HashMap<>();
    HashMap<Integer, BorrowBook> borrowBooks = new HashMap<>();


    public Biblioteca(HashMap<Integer, User> users, HashMap<Integer, BookWithAmount> books, HashMap<Integer, BorrowBook> borrowBooks) {
        this.users = users;
        this.books = books;
        this.borrowBooks = borrowBooks;
    }

    public HashMap<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Integer, User> users) {
        this.users = users;
    }

    public HashMap<Integer, BookWithAmount> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Integer, BookWithAmount> books) {
        this.books = books;
    }

    public HashMap<Integer, BorrowBook> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(HashMap<Integer, BorrowBook> borrowBooks) {
        this.borrowBooks = borrowBooks;
    }

    public void usersToString () {
        users.forEach((key, value) -> {
            System.out.println("Key: " + key + ", User: " + value.getName() + " " + value.getSurname() + " tax code: " + value.getTaxCode() + ", available books " + value.getAvailableBooks());
        });
    }

    public void booksToString () {
        books.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Book: " + value.getBook().getName() + ", Author: " + value.getBook().getAuthor() + " Amount: " + value.getAmountOfBooks());
        });
    }

    public void borrowBooksToString () {
        borrowBooks.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Book: " + value.getBook().getName() + ", Author: " + value.getBook().getAuthor());
        });
    }

    public void getUserBorrowBooksToString (User user) {

        borrowBooks.forEach((key, value) -> {
        if (value.getUser() == user) {
            System.out.println("Key: " + key + ", Book: " + value.getBook().getName() + ", Author: " + value.getBook().getAuthor());
        }
        });
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "users=" + users +
                ", books=" + books +
                ", borrowBooks=" + borrowBooks +
                '}';
    }
}
