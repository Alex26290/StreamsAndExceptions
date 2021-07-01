package errors.exceptions;

public class ControllersLayerException extends Exception {

    public ControllersLayerException(String message) {
        super(message);
    }

    public ControllersLayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ControllersLayerException(Throwable cause) {
        super(cause);
    }

    public ControllersLayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
