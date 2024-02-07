package DAY6.C1;

class FictionBook extends Book{
    public FictionBook(String title,String author, String isbn){
        super(title,author,isbn);
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction book information:");
        super.displayInfo();
        System.out.println("Type:Horror book");
    }

}
