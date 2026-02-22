package Forms;
public class Form {
    public int duration;
    public String use_of_car;
    public Form(int duration, String use_of_car) {
        this.duration = duration;
        this.use_of_car = use_of_car;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Duration: " + duration + ", Use of car: " + use_of_car;
    }
    
}
