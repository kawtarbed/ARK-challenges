package DAY8;

public class C5 {
    public static void main(String args[]) {
        try{
            String str=null;
            System.out.println (str.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException..");
        }
    }
}
