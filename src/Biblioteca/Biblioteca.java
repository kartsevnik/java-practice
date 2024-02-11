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

    @Override
    public String toString() {
        return "Biblioteca{" +
                "users=" + users +
                ", books=" + books +
                ", borrowBooks=" + borrowBooks +
                '}';
    }
}
