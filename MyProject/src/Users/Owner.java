package Users;

public class Owner extends User{
    public Owner(String name, int age, String profession, String address) {
        super(name, age, profession, address);
    }
    public void updatePrice(){
        System.out.println("Price Updated");
    }
    public void aprrove_request(){
        System.out.println("Request Approved");
    }
    public void refuse_request(){
        System.out.println("Request rejected");
    }
}
