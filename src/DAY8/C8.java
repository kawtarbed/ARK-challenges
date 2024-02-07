package DAY8;

public class C8 {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            arr[10]=7/0 ;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
        System.out.println("rest of the code");
    }
}
