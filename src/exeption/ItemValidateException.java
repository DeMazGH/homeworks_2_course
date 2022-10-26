package exeption;

public class ItemValidateException extends RuntimeException{
    public ItemValidateException() {
    }

    public ItemValidateException(String message) {
        super(message);
    }

    public ItemValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemValidateException(Throwable cause) {
        super(cause);
    }

    public ItemValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
