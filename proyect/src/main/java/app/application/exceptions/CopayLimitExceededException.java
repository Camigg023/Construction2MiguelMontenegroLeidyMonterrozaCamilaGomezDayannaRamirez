package src.main.java.app.application.exceptions;

public class CopayLimitExceededException extends RuntimeException {
    public CopayLimitExceededException(String message) {
        super(message);
    }
}
