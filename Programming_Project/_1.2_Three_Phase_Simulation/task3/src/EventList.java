import java.util.Objects;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class EventList {
    private PriorityQueue<Event> eventList;
    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void add(Event e) {
        System.out.println("Adding to the event list " + e.getType() + " " + e.getTime());
        eventList.add(e);
    }
    public Event remove() {
        if (!eventList.isEmpty()) {
            Event removedEvent = eventList.poll();
            System.out.println("Removing from the event list " + removedEvent.getType() + removedEvent.getTime());
            return removedEvent;
        } else {
            System.out.println("Event list is empty");
            return null;
        }
    }
    public void print() {
        PriorityQueue<Event> sortedEvents = new PriorityQueue<>(eventList);
        while (!sortedEvents.isEmpty()) {
            Event e = sortedEvents.poll();
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        EventList eventList = new EventList();
        Random random = new Random();

        //generate events
        for (int i = 0; i<10; i++) {
            EventType type;
            if(random.nextBoolean())
                type = EventType.ARR;
            else
                type = EventType.DEP;
            eventList.add(new Event(type, random.nextInt(1000)));
        }

        System.out.println("Event removed: "+eventList.remove());

        eventList.print();
    }
}
