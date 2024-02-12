package Biblioteca;

public class Book {
    private String name;
    private String author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        System.out.println(this.name + " - " + this.author);
        return null;
    }
}
