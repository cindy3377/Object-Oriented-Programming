import eduni.distributions.*;

public class ArrivalProcess {
    private RandomNumberGenerator rng;
    private EventType eventType;

    public ArrivalProcess(RandomNumberGenerator rng, EventType eventType) {
        this.rng = rng;
        this.eventType = eventType;
    }

    public void addArrival(EventList eventList) {
        // Generate arrival interval based on the distribution
        double arrivalInterval = rng.sample();

        // Create a new arrival event and add it to the event list
        Event arrivalEvent = new Event(eventType, Clock.getInstance().getTime() + arrivalInterval);
        eventList.addEvent(arrivalEvent);
    }
}
