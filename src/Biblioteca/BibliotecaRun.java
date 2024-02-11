package Biblioteca;

// Implementare un sistema Bibliotecario che consenta all’utenza di poter prendere
// in prestito dei Libri. I Libri devono esser restituiti entro un tempo massimo di un
// mese (30 giorni) e l’utente può richiedere in prestito al massimo 3 libri per volta.
// - Fornire l’elenco di tutti i Libri rilasciati in prestito (dalla biblioteca)
// -Fornire l’elenco dei Libri rilasciati per una determinata persona

// Внедрите библиотечную систему, позволяющую пользователям брать книги на дом.
// Одолжить книги.
// Книги должны быть возвращены в течение не более одного месяца (30 дней),
// и пользователь может взять не более 3 книг за один раз.
// - Предоставить список всех книг, взятых на время (из библиотеки).
// - Предоставить список книг, выданных конкретному человеку
import java.util.Scanner;
import java.util.HashMap;

public class BibliotecaRun {
    public static void main(String[] args) {
        HashMap<Integer, User> users = addArrOfUsers();
        HashMap<Integer, BookWithAmount> books = addArrOfBooks();
        HashMap<Integer, BorrowBook> borrowBooks = addArrOfBorrowBook();
        Biblioteca biblioteca = new Biblioteca(users, books, borrowBooks);

        System.out.println(biblioteca.users.get(1).toString());

        Scanner input = new Scanner(System.in);
        int scelta = 0;
        do {
            scelta = menu(input);

            switch (scelta) {
                case 1:
                    // View List of Books in the Library
                    biblioteca.books.forEach((key, value) -> {
                        System.out.println("Key: " + key + ", Book: " + value.getBook().getName() + " " + value.getBook().getAuthor() + " Amount: " + value.getAmountOfBooks());
                    });

                    break;
                case 2:
                    // View List of Users in the Library
                    biblioteca.users.forEach((key, value) -> {
                        System.out.println("Key: " + key + ", User: " + value.getName() + " " + value.getSurname() + " tax code: " + value.getTaxCode() + ", available books " + value.getAvailableBooks());
                    });
                    break;
                case 3:
                    // Add user
                    System.out.println();
                    User newUser = addUser(input);
                    users.put((users.size() + 1), newUser);
                    break;
                case 4:
                    // Remove user
//                    System.out.println();
//                    Users.toString();
//                    int index = removeUser(input);
//                    Users.removeUserByIndex(index);
                    break;
                case 5:
                    // Issue the book
//                    System.out.println();
//
//                    Users.toString();
//                    System.out.println("Enter the user number");
//                    int userIndex = input.nextInt();
//
//                    library.toString();
//                    System.out.println("Choose a book");
//                    int bookIndex = input.nextInt();

                    // check availability =======================
//                    User idUser = Users.getUser(userIndex);
//                    int amountBookUser = idUser.getAvailableBooks();
//
//                    BookList tmpBookList = library.getBookList(bookIndex);
//                    int amountBook = tmpBookList.getAmount();
//
//                    if (amountBookUser == 0) {
//                        System.out.println("You cannot take the book.First return those who took early");
//                        break;
//                    }
//
//                    if (amountBook == 0) {
//                        System.out.println("Unfortunately, these books were dismantled, come later");
//                        break;
//                    }
                    // ======================= =======================

                    // create Book for issuing
//                    tempBookList = createTBook(tempBookList, tmpBookList, idUser, amountBookUser, amountBook);
//
//                    System.out.println(
//                            "Thank you for using our library, do not forget that the book is issued up to a maximum of 30 days");
                    break;
                case 6:
                    // List of all books taken for a while (from the library)
//                    System.out.println();
//                    System.out.println(tempBookList.toStringOnlyBook());
                    break;
                case 7:
                    // List of books issued to a particular person
//                    Users.toString();
//                    issuedBooks(tempBookList, Users, input);
                    break;
            }
        } while (scelta > 0);

        System.out.println("Finished program");
        input.close();

    }

    public static int menu(Scanner i) {
        System.out.println();
        System.out.println("Choose an action:");
        System.out.println("1. View List of Books in the Library");
        System.out.println("2. View List of Users in the Library");
        System.out.println("3. Add user");
        System.out.println("4. Remove user");
        System.out.println("5. Issue the book");
        System.out.println("6. List of all books taken for a while (from the library)");
        System.out.println("7. List of books issued to a particular person");
        System.out.println("0 - exit");
        return i.nextInt();
    }

    private static HashMap<Integer, BorrowBook> addArrOfBorrowBook() {
        HashMap<Integer, BorrowBook> borrowBooks = new HashMap<>();
        //        BorrowBook borrowBook1 = new BorrowBook(book1.getBook(), user2);
//        borrowBooks.put(1, borrowBook1);
        return borrowBooks;
    }

    private static HashMap<Integer, BookWithAmount> addArrOfBooks() {
        // Create books with amount
        BookWithAmount book1 = new BookWithAmount("War and Peace", "Leo Tolstoy", 5);
        BookWithAmount book2 = new BookWithAmount("Crime and Punishment", "Fyodor Dostoevsky", 3);
        BookWithAmount book3 = new BookWithAmount("The Master and Margarita", "Mikhail Bulgakov", 2);
        BookWithAmount book4 = new BookWithAmount("1984", "George Orwell", 10);
        BookWithAmount book5 = new BookWithAmount("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 7);
        BookWithAmount book6 = new BookWithAmount("Anna Karenina", "Leo Tolstoy", 1);
        BookWithAmount book7 = new BookWithAmount("The Little Prince", "Antoine de Saint-Exupéry", 0);
        BookWithAmount book8 = new BookWithAmount("Ulysses", "James Joyce", 6);
        BookWithAmount book9 = new BookWithAmount("To Kill a Mockingbird", "Harper Lee", 7);
        BookWithAmount book10 = new BookWithAmount("The Great Gatsby", "F. Scott Fitzgerald", 5);
        BookWithAmount book11 = new BookWithAmount("Pride and Prejudice", "Jane Austen", 4);
        BookWithAmount book12 = new BookWithAmount("The Catcher in the Rye", "J.D. Salinger", 8);
        BookWithAmount book13 = new BookWithAmount("Moby-Dick", "Herman Melville", 3);
        BookWithAmount book14 = new BookWithAmount("The Lord of the Rings", "J.R.R. Tolkien", 5);
        BookWithAmount book15 = new BookWithAmount("The Hobbit", "J.R.R. Tolkien", 4);
        BookWithAmount book16 = new BookWithAmount("Brave New World", "Aldous Huxley", 7);
        BookWithAmount book17 = new BookWithAmount("The Picture of Dorian Gray", "Oscar Wilde", 2);
        BookWithAmount book18 = new BookWithAmount("Frankenstein", "Mary Shelley", 1);
        BookWithAmount book19 = new BookWithAmount("Alice's Adventures in Wonderland", "Lewis Carroll", 7);
        BookWithAmount book20 = new BookWithAmount("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 6);

        HashMap<Integer, BookWithAmount> books = new HashMap<>();

        books.put(1, book1);
        books.put(2, book2);
        books.put(3, book3);
        books.put(4, book4);
        books.put(5, book5);
        books.put(6, book6);
        books.put(7, book7);
        books.put(8, book8);
        books.put(9, book9);
        books.put(10, book10);
        books.put(11, book11);
        books.put(12, book12);
        books.put(13, book13);
        books.put(14, book14);
        books.put(15, book15);
        books.put(16, book16);
        books.put(17, book17);
        books.put(18, book18);
        books.put(19, book19);
        books.put(20, book20);
        return books;
    }

    private static HashMap<Integer, User> addArrOfUsers() {
        // Create users
        User user1 = new User("Mykola", "Kartsev", 235654656);
        User user2 = new User("Alice", "Smith", 987654321);
        User user3 = new User("Bob", "Johnson", 456789123);
        User user4 = new User("Emily", "Brown", 654321987);
        User user5 = new User("Michael", "Davis", 789123456);
        User user6 = new User("Emma", "Wilson", 321987654);
        User user7 = new User("William", "Taylor", 654987321);
        User user8 = new User("Sophia", "Anderson", 159753468);
        User user9 = new User("James", "Martinez", 357159486);
        User user10 = new User("Olivia", "Thompson", 852963741);
        User user11 = new User("John", "Doe", 123456789);

        HashMap<Integer, User> users = new HashMap<>();

        users.put(1, user1);
        users.put(2, user2);
        users.put(3, user3);
        users.put(4, user4);
        users.put(5, user5);
        users.put(6, user6);
        users.put(7, user7);
        users.put(8, user8);
        users.put(9, user9);
        users.put(10, user10);
        users.put(11, user11);
        return users;
    }

    public static User addUser(Scanner i) {

        System.out.println("Write name");
        String newName = i.next();

        System.out.println("Write surname");
        String newSurname = i.next();

        System.out.println("Write tax code");
        int taxCode = i.nextInt();
        User newUser = new User(newName, newSurname, taxCode);
        return newUser;
    }
}
