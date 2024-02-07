package DAY11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Story {
    private List<Sentence> sentences;
    private int orderCounter;

    public Story() {
        sentences = new ArrayList<>();
    }

    public void addSentence(String text, String author) {
        Sentence newSentence = new Sentence(text, author, orderCounter++);
        sentences.add(newSentence);

    }

    public void printStory() {
        for (Sentence newSentence : sentences) {
            System.out.println(newSentence);
        }
    }

    public void saveProgress(String fileName) {
        try (FileWriter fileWriter = new FileWriter("My story.txt")) {
            fileWriter.write(sentences.toString() + "\n");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public void loadProgress(String fileName){
        try(FileReader fileReader=new FileReader("My story.txt")) {
        
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Reader fileReader;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(";;;"))){
            String line;
            
        }catch(IOException e){
    
    
        }
    }
}