package lab9.part2.prob13;

import java.util.List;

/**
 * Created by Bi on 7/14/17.
 */
public class Main {
    public static void main(String[] args) {
        // set up
        Book book = new Book("Test", 3);
        List<BookCopy> copies = book.getCopies();
        copies.forEach(copy -> copy.changeAvailability());

        // test
        System.out.println(book.isAvailable());
    }
}
