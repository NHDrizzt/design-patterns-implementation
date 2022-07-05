package Services;

public class UserRestService implements UserService{

    @Override
    public void save() {
        System.out.println("Saving Rest user service");
        
    }

    @Override
    public void delete() {
        System.out.println("Deleting Rest user service");
    }
    
}
