package Biblioteca;

public class User {

    private String name;
    private String surname;
    private int taxCode;
    private int availableBooks = 3;

    public User(String name, String surname, int taxCode) {
        this.name = name;
        this.surname = surname;
        this.taxCode = taxCode;
    }

    public int getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(int taxCode) {
        this.taxCode = taxCode;
    }

    public void outputToString() {
        System.out.println(this.name + " " + this.surname + ". Tax code: " + this.taxCode);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", taxCode=" + taxCode +
                ", availableBooks=" + availableBooks +
                '}';
    }
}
