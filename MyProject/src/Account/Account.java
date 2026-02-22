package Account;
public class Account {
    public String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void authenticate() {
        System.out.println("Authenticated");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: " + name + ", password: " + password;
    }


}
