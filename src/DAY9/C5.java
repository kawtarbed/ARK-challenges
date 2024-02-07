package DAY9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class C5 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.remove(2);

        System.out.println("Elements of the Linkedlist are : "+fruits);
        System.out.println("Lenght of the LinkedList: "+fruits.size());
        Collections.reverse(fruits);
        System.out.println("Reversed LinkedList is: "+fruits);
    }
}
