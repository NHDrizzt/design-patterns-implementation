package App;


import AbstractFactory.EjbAbstractFactory;
import AbstractFactory.ServicesAbstractFactory;
import Services.CarService;
import Services.UserService;

public class Client {
    public static void main(String[] args) {
        ServicesAbstractFactory servicesAbstractFactory = new EjbAbstractFactory();

        myUserService(servicesAbstractFactory);
        myCarService(servicesAbstractFactory);
    }

    public static void myUserService(ServicesAbstractFactory serviceFactory){
        UserService userService = serviceFactory.getUserService();
        userService.save();
        userService.delete();
    }

    public static void myCarService(ServicesAbstractFactory serviceFactory){
        CarService carService = serviceFactory.getCarService();
        carService.save();
        carService.delete();
    }
}
