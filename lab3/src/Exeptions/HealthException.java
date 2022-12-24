package Exeptions;

public class HealthException extends RuntimeException{
    public HealthException() {
    }

    public HealthException(String message) {
        super(message);
    }

    public HealthException(String message, Throwable cause) {
        super(message, cause);
    }

    public HealthException(Throwable cause) {
        super(cause);
    }

    public HealthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
