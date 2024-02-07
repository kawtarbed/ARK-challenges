package DAY6.C1;

import java.util.ArrayList;
public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public Library() {

        books.add(new FictionBook("Invisible Man", "Ralph Ellison", "9780679732761"));
        books.add(new NonFictionBook("Atomic Habits", "James Clear", "9780735211292"));
        books.add(new Book("Generic Book", "Generic Author", "0000093000000"));


    }

    public void displayInfo() {
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }

}
