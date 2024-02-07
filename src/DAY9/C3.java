package DAY9;

import java.sql.SQLOutput;
import java.util.*;
public class C3{
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("SQL");
        stack.push("CSS");
        System.out.println("Stack elements: "+stack);
        for(String str: stack){
            System.out.println(str);
        }
        System.out.println("Peek:"+stack.peek());
        for(String a:stack)
            System.out.println(a);
        Collections.reverse(stack);
        System.out.println(stack);


        stack.pop();


        System.out.println("Updated tack elements: ");
        for(String str: stack){
            System.out.println(str);
        }
    }
}
