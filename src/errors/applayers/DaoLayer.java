package errors.applayers;

import errors.exceptions.DaoLayerException;

public class DaoLayer {

    public void run() {
        try {
            String s = null;
            s.toUpperCase();
        } catch (NullPointerException e) {
            throw new DaoLayerException("Нуль Поинтер Эксепшен", e);
        }
    }

}
