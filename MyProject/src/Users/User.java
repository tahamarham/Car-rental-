package Users;

public class User {
    public String name;
    public int age;
    public String profession;
    public String address;
    public User(String name, int age, String profession, String address) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.address = address;
    }

    public void update_info(String name, int age, String profession, String address) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.address = address;
        System.out.println("Infromation Updated");
    }
}
