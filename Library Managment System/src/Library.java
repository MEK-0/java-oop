

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kitap Eklendi: " + book.getTitle());
    }

    public void removeBook(int bookId) {
        books.removeIf(book -> book.getId() == bookId);
        System.out.println("Kitap iade edildi ID: " + bookId);
    }

    public void listBooks() {
        System.out.println("Tüm Kitaplar:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("Kitap ödünç Alındı: " + book.getTitle());
                } else {
                    System.out.println("Kitap ödünç alınamadı.");
                }
                return;
            }
        }
        System.out.println("Kitap Bulunumadı.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Kitap iade edildi: " + book.getTitle());
                } else {
                    System.out.println("Kitap iade edilemedi.");
                }
                return;
            }
        }
        System.out.println("Kitap Bulunamadı.");
    }
}
