import java.util.PriorityQueue;
import java.util.Random;

public class Event implements Comparable<Event> {
    private long time;

    public Event(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    @Override
    public int compareTo(Event e) {
        if (this.time < e.time)
            return -1;
        else if (this.time > e.time)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        EventList eventList = new EventList();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            eventList.add(new Event(random.nextInt(1000)));
        }

        System.out.println("Event removed: " + eventList.remove());
        eventList.print();
    }
}
