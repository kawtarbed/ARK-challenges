package DAY11;

public class Sentence {
    private String text;
    private String author;
    private int order;
    public Sentence(String text,String author,int order){
        this.text=text;
        this.author=author;
        this.order=order;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public String toString(){
        return order+"," + author +","+ text;
    }


}
