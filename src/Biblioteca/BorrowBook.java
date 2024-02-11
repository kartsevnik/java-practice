package Biblioteca;

import java.util.Date;

public class BorrowBook {

    private Book book;
    private User user;
    private Date dateOfBorrow;

    public BorrowBook(Book book, User user) {
        this.book = book;
        this.user = user;
        Date dateOfBorrow = new Date();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(Date dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }



    @Override
    public String toString() {
        return "BorrowBook{" +
                "book=" + book +
                ", user=" + user +
                ", dateOfBorrow=" + dateOfBorrow +
                '}';
    }

}
