package DAY8;

public class C9 {
    public static void main(String[] args) {
        try {
            int a[] = null;
            System.out.println(a[1]);
        } catch (NullPointerException ex) {
            System.out.println("exception: "+ex);
        }
    }
}
