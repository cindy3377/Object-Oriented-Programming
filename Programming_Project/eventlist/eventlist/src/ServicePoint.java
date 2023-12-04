import eduni.distributions.Normal;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue;
    private ContinuousGenerator generator;
    private EventList eventList;
    private EventType type;

    private double serviceTimeSum;
    private int customersServed;
    private boolean reserved = true;

    public ServicePoint(ContinuousGenerator g, EventList tl, EventType type) {
        queue = new LinkedList<>();
        this.generator = g;
        this.eventList = tl;
        this.eventTypeScheduled = type;
        this.serviceTimeSum = 0;
        this.customersServed = 0;
        queue = new LinkedList<>();
    }

    public void addToQueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueue() {
        if (queue.size() > 0) {
            Customer a = queue.removeLast();
            a.setRemovalTime(Clock.getInstance().getClock());
            double serviceTime = a.getRemovalTime() - a.getArrivalTime();
            System.out.printf("‰sCustomer #‰d " + " service time: " + + a.getId(), serviceTime, WHITE);
            serviceTimeSum += serviceTime;
            customersServed++;
            reserved = false;
            return a;
        } else
            return null;
    }

    pucblic void beginService() {
        System.out.println("Starting new service for the customer #" + queue.peek().getId());
        reserved = true;
        double serviceTime = generator.sample();
        Event t = new Event(type, eventTypeScheduled, Clock.getInstance().getClock() + serviceTime);
        eventList.add(t);
    }

    public double getAverageServiceTime() {
        return serviceTimeSum / customersServed;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean isOnQueue() {
        return queue.size() > 0;
    }

    public int getCustomersServed() {
        return customersServed;
    }

    public void serve() {
        Customer a;
        Normal normalGenerator = new Normal(5, 1);

        //Clock.getInstance().setClock(Clock.getInstance().getClock() + 5);
        a = removeFromQueue();
        while (a != null) {
            Clock.getInstance().setClock(Clock.getInstance().getClock() + normalGenerator.sample());

            a.setRemovalTime(Clock.getInstance().getClock());
            a.reportResults();

            a = removeFromQueue();
        }
    }
}
