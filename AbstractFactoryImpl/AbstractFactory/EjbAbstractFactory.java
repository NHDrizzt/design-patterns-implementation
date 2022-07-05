package AbstractFactory;


import Services.CarEJBService;
import Services.CarService;
import Services.UserEJBService;
import Services.UserService;

public class EjbAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }



}
