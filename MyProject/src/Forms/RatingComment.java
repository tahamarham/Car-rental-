package Forms;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class RatingComment {

    int rating;
    String comment;
    GregorianCalendar date_and_time;
    boolean posted;

    public RatingComment(int rating, String comment, GregorianCalendar date_and_time) {
        this.rating = rating;
        this.comment = comment;
        this.date_and_time = date_and_time;
        posted = false;
    }

    public void rate() {
        if (posted) {
            System.out.println("this rating is already published");
            return;
        }
        System.out.println("Posted your rating");
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date_and_time.getTime());

        return "Rating: " + rating + ", Comment: " + comment + ", Date and Time: " + formattedDate;

    }
}