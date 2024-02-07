package DAY6.C1;

class NonFictionBook extends Book{
    public NonFictionBook(String title,String author, String isbn){
        super(title,author,isbn);
    }
    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction book information:");
        super.displayInfo();
        System.out.println("Type:Personal development  book");
    }


}