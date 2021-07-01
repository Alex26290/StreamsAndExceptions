package errors.applayers;

import errors.exceptions.DaoLayerException;
import errors.exceptions.ServiceLayerException;

public class ServiceLayer {

    private DaoLayer dao;

    public ServiceLayer() {
    }

    public ServiceLayer(DaoLayer dao) {
        this.dao = dao;
    }

    public DaoLayer getDao() {
        return dao;
    }

    public void setDao(DaoLayer dao) {
        this.dao = dao;
    }

    public void run() {
        try {
            this.getDao().run();
        } catch (DaoLayerException e) {
            throw new ServiceLayerException(e);
        }
    }
}
