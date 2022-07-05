package Services;

public class UserEJBService implements UserService {

    @Override
    public void save() {
        System.out.println("Saving User EJB Service");
    }

    @Override
    public void delete() {
        System.out.println("Deleting User EJB Service");
    }
    
}
