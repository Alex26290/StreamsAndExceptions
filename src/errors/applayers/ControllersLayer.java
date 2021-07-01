package errors.applayers;

import errors.exceptions.ControllersLayerException;
import errors.exceptions.ServiceLayerException;

public class ControllersLayer {

    private ServiceLayer service;

    public ControllersLayer() {
    }

    public ControllersLayer(ServiceLayer service) {
        this.service = service;
    }

    public ServiceLayer getService() {
        return service;
    }

    public void setService(ServiceLayer service) {
        this.service = service;
    }

    public void run() throws ControllersLayerException{
        try {
             this.getService().run();
        } catch (ServiceLayerException e){
            throw new ControllersLayerException(e);
        }
    }
}
