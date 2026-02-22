package Account;

public class Notification {
    public String date;
    public String time;
    public String content;

    public Notification(String date, String time, String content) {
        this.date = date;
        this.time = time;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Time: " + time + ", Content: " + content;
    }
}
