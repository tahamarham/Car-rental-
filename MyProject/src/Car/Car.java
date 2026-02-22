package Car;

public class Car {
    public String model;
    public String make;
    public GearboxType gearbox_type;
    public int number_of_doors;
    public String type;
    public int year;
    
    public Car(String model, String make, GearboxType gearbox_type, int number_of_doors, String type, int year) {
        this.model = model;
        this.make = make;
        this.gearbox_type = gearbox_type;
        this.number_of_doors = number_of_doors;
        this.type = type;
        this.year = year;
    }

    public void update_car(String model, String make, GearboxType gearbox_type, int number_of_doors, String type, int year) {
        this.model = model;
        this.make = make;
        this.gearbox_type = gearbox_type;
        this.number_of_doors = number_of_doors;
        this.type = type;
        this.year = year;
    }

    public void add_car(){
        System.out.println("Car added");
    }
    public void hide_car(){
        System.out.println("Car hidden");
    }
    @Override
    public String toString() {
        return "Make: " + make +
        ", Model: " + model +
        ", Year: " + year +
        ", Type: " + type +
        ", Gearbox Type: " + gearbox_type +
        ", Number of Doors: " + number_of_doors;
    } 

}
