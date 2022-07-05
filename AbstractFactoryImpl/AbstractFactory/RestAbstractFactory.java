package AbstractFactory;

import Services.CarRestService;
import Services.CarService;
import Services.UserRestService;
import Services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}