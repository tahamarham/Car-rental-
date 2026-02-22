package Account;
import java.util.GregorianCalendar;

public class Message {
    GregorianCalendar date_and_time;
    String message;
    public Message(GregorianCalendar date_and_time, String message) {
        this.date_and_time = date_and_time;
        this.message = message;
    }
    
}
