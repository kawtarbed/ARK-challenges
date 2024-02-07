package DAY9;
import java.util.*;
public class C2 {
    public static void main(String args[]) {

        ArrayList<String> obj = new ArrayList<String>();

        obj.add("Squat");
        obj.add("Bench Press");
        obj.add("Chest Fly");
        obj.add("Dancing");
        obj.add("pilates");


        System.out.println("Original ArrayList:");
        Iterator<String> it=obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        obj.add("Leg press");


        System.out.println("ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);



        obj.remove("Dancing");


        System.out.println("ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);


        System.out.println("Final ArrayList:");
        for(String str:obj)
            System.out.println(str);



        if (obj.contains("Dancing")) {
            System.out.println("Dancing exists in the ArrayList");
        } else {
            System.out.println("Dancing does not exist in the ArrayList");
        }
        System.out.println("       ");
        System.out.println("the current gymactivities in the ArrayList are: ");


        for(String str:obj)
            System.out.println(str);

    }

}
