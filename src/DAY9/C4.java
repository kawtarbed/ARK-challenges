package DAY9;

import java.util.*;

public class C4 {

    public static void main(String[] args) {


        Queue<String> dq = new LinkedList<>();


        dq.add("Glenn");
        dq.add("Negan");
        dq.add("Maggie");
        dq.add("Rick");
        dq.add("Daryl");
        System.out.println("Elements of the queue: "+dq);


        System.out.println("peek(): "+dq.peek());
        System.out.println("Pop: "+dq.poll());
        dq.poll();
        System.out.println("Elements of the queue: ");

        Iterator<String> it= dq.iterator();
        while (it.hasNext()){System.out.println(it.next());
        }

        System.out.println("Original Queue: " + dq);
        dq = (dq);


    }
}