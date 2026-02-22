package Users;

public class Renter extends Owner{

    public Renter(String name, int age, String profession, String address) {
        super(name, age, profession, address);
        
    }
    public void view_top_rated_owners(){

    }
    public void rent_request(){

        System.out.println("Requested");
        System.err.println("ddd");
    }
    
}
