/* import eduni.distributions.ContinuousGenerator; */
/* import eduni.distributions.Negexp; */

import eduni.distributions.ContinuousGenerator;

/* to add arrival events to the event list */
public class ArrivalProcess {
    private ContinuousGenerator generator;
    private EventList eventList;
    private EventType type;

    public ArrivalProcess(ContinuousGenerator g, EventList tl, EventType type) {
        this.generator = g;
        this.eventList = tl;
        this.type = type;
    }

    public double generateNextEvent() {
        double eventTime = Clock.getInstance().getClock() + generator.sample();
        Event t = new Event(type, eventTime);
        eventList.add(t);

        return eventTime;
    }

}
