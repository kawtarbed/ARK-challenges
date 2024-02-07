package DAY11;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter author 1 name: ");
        String author1= scanner.nextLine();

        System.out.println("Enter author 2 name: ");
        String author2= scanner.nextLine();
        Story story=new Story();

        while(true){
            System.out.print(author1+ " enter your story, and type exit to finish it: ");
            String text = scanner.nextLine();

            if ("exit".equalsIgnoreCase(text)){
                break;
            }
            story.addSentence(text,author1);
            story.printStory();

            System.out.println(author2+" enter your story, and type exit to finish it : ");
            text = scanner.nextLine();

            if ("exit".equalsIgnoreCase(text)){
                break;
            }
            story.addSentence(text,author2);
            story.printStory();

            story.saveProgress("My story.txt");
        }
        story.loadProgress("My story.txt");
        System.out.println("full story: ");
        story.printStory();
        scanner.close();

    }
}
