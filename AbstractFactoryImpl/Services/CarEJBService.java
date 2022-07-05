package Services;

public class CarEJBService implements CarService{

    @Override
    public void save() {
        System.out.println("Saving Car EJB Service"); 
    }

    @Override
    public void delete() {
        System.out.println("Deleting Car EJB Service");
    }
    
}
