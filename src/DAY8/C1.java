package DAY8;

public class C1 {
    public static void main(String[] args) {
        try {
            int numbers[]=new int[5];
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ******: "+e);
        }
    }
}