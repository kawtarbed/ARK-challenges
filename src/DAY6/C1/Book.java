package DAY6.C1;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author,String isbn) {
        this.title = title;
        this.author = author;
        this.isbn=isbn;
    }

    public void setTitle(String newTitle){
        System.out.println("Enter the title");
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String newAuthor){
        author=newAuthor;
        System.out.println("Enter the author's name");
    }
    public String getAuthor() {
        return author;
    }

    public void setIsbn (String newIsbn){
        System.out.println("Enter the isbn");
    }

    public String getAIsbn() {
        return isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }


}

