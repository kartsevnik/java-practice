package Biblioteca;

public class BookWithAmount extends Book {

    private Book book;
    private int amountOfBooks;

    public BookWithAmount(String name, String author, int amountOfBooks) {
        super(name, author);
        this.book = new Book(name, author);
        this.amountOfBooks = amountOfBooks;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

    @Override
    public String toString() {
        return "BookAmount{" +
                "book=" + book +
                ", amountOfBooks=" + amountOfBooks +
                '}';
    }
}
