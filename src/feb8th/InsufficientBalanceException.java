package feb8th;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        System.out.println("InsufficientBalanceException ");
    }

    public InsufficientBalanceException(String message) {
        System.out.println("InsufficientBalanceException "+message);
    }

    public InsufficientBalanceException(String message, Throwable cause) {
        System.out.println("InsufficientBalanceException "+message+" "+cause);
    }

    public InsufficientBalanceException(Throwable cause) {
        System.out.println("InsufficientBalanceException "+cause);
    }
}
