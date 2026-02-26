import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn);
    }
}

public class Musap {

    private final ArrayList<Book> books;

    public Musap() {
        books = new ArrayList<>();
    }

    // إضافة كتاب
    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully.");
    }

    // حذف كتاب بواسطة ISBN
    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isbn.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // البحث عن كتاب
    public void searchBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                System.out.println("Book found:");
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // عرض جميع الكتب
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    // دالة main للتجربة
    public static void main(String[] args) {
        musap library = new musap();

        library.addBook("Java Basics", "Ali Ahmad", "111");
        library.addBook("Data Structures", "Sara Khaled", "222");

        library.displayAllBooks();

        library.searchBook("111");

        library.removeBook("111");

        library.displayAllBooks();
    }
}