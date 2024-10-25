package classwork.book;

import java.util.Locale;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == array.length) {
            extend();
        }
        array[size++] = book;
    }

    private void extend() {
        Book[] newArray = new Book[size + 10];
        int ind = 0;
        for (Book book : array) {
            newArray[ind++] = book;
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                found = true;
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("book with " + keyword + " does not exist");
        }
    }
}
