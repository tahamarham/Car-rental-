package Forms;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;;

public class Post {
    GregorianCalendar date_and_time;
    String post;

    public Post(GregorianCalendar date_and_time, String post) {
        this.date_and_time = date_and_time;
        this.post = post;
    }

    public void update_post(GregorianCalendar date_and_time, String post) {
        this.date_and_time = date_and_time;
        this.post = post;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date_and_time.getTime());

        return "Date and Time: " + formattedDate + ", Post: " + post;
    }
}
