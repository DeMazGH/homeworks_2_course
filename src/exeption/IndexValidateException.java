package exeption;

public class IndexValidateException extends RuntimeException{
    public IndexValidateException() {
    }

    public IndexValidateException(String message) {
        super(message);
    }

    public IndexValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexValidateException(Throwable cause) {
        super(cause);
    }

    public IndexValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
