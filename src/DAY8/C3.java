package DAY8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class C3{
    public static void main (String[] args){
        try {
            FileReader f = new FileReader("file.txt");
        } catch (FileNotFoundException f){
            System.out.println("Exception: "+f);
        }
    }
}
