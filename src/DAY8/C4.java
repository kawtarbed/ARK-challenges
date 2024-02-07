package DAY8;

public class C4{
    public static void main(String[] args) {
        try {
            validateInput(5);
        } catch (CustomException mce) {
            System.err.println("CustomException caught: " + mce.getMessage());
        }
    }

    private static void validateInput(int value) throws CustomException {
        if (value < 10) {
            throw new CustomException("Input must be greater than or equal to 10");
        } else {
            System.out.println("Input is valid.");
        }
    }
}


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
