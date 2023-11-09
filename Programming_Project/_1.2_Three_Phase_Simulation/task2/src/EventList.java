import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventList;

    public EventList() {
        eventList = new PriorityQueue<>();
    }

    public void add(Event e) {
        System.out.println("Adding to the event list " + e.getTime());
        eventList.add(e);
    }

    public Event remove() {
        if (!eventList.isEmpty()) {
            Event removedEvent = eventList.poll();
            System.out.println("Removing from the event list " + removedEvent.getTime());
            return removedEvent;
        } else {
            System.out.println("Event list is empty");
            return null;
        }
    }

    public void print() {
        while (!eventList.isEmpty()) {
            Event e = eventList.poll();
            System.out.println(e.getTime());
        }
    }
}
