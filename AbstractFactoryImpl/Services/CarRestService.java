package Services;

public class CarRestService implements CarService {

    @Override
    public void save() {
        System.out.println("Saving CarRestService");
    }

    @Override
    public void delete() {
        System.out.println("Deleting CarRestService");
    }
    
}
