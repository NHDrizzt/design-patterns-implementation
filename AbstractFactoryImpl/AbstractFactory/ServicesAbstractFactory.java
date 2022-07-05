package AbstractFactory;

import Services.CarService;
import Services.UserService;

public interface ServicesAbstractFactory {
    CarService getCarService();
    UserService getUserService();
}
