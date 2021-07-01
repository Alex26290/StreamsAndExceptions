package errors.exceptions;

public class DaoLayerException extends RuntimeException{


    public DaoLayerException(String message) {
        super(message);
    }

    public DaoLayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoLayerException(Throwable cause) {
        super(cause);
    }

    public DaoLayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
