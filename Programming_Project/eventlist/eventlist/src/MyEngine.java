/* simulate a queuing system with one service point and one queue
* The service time is normally distributed */

public class MyEngine extends Engine {
    private ArrivalProcess arrivalProcess;
    private ServicePoint[] servicePoint;

    public MyEngine() {
        super();
        servicePoint = new ServicePoint[1];
        servicePoint[0] = new ServicePoint(new Normal(10, 6), eventList, EventType.DEP);
        arrivalProcess = new ArrivalProcess(new Negexp(15), eventList, EventType.ARR);

    }
    protected void initialize() {
        arrivalProcess.generateNextEvent();
    }
    protected void runEvent (Event e) {
        switch (e.getType()) {
            case ARR:
                servicePoint[0].addToQueue(new Customer());
                arrivalProcess.generateNextEvent();
                break;
            case DEP:
                servicePoint[0].removeFromQueue();
                break;
        }
    }
    protected void tryCEvents() {
        for (ServicePoint sp: servicePoint) {
            if(!sp.isReserved() && !sp.isOnQueue()) {
                sp.serve();
                sp.beginService();
            }
        }
    }

    protected void results() {
        System.out.printf("\nSimulation finished at %.2f\n" + Clock.getInstance().getClock());
        System.out.println("Total number of customers served: " + servicePoint[0].getCustomersServed());
        System.out.printf("Average service time ‰.2f\n: " + servicePoint[0].getAverageServiceTime());
    }
}
