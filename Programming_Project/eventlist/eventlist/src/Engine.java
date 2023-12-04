public abstract class Engine {
    private static final String RED = "\033[0;31m"; //ANSI escape code for red color
    private static final String WHITE =  "\033[0;37m"; //ANSI escape code for white color
    private static final String GREEN = "\033[0;32m"; //ANSI escape code for green color

    private double simulation = 0;
    protected EventList eventList;

    public Engine() {
        eventList = new EventList();
    }

    public void setSimulationTime(double simulationTime) {
        this.simulationTime = simulationTime;
    }

    public void run(){
        initialize();

        while (simulate()) {
            System.out.printf("%sA-phase:%s time is %.2f\n", RED, WHITE, currentTime());
            Clock.getInstance().setClock(currentTime());

            System.out.printf("%sB-phase:%s", RED, WHITE);
            runBEvents();

            System.out.printf("%sC-phase:%s", RED, WHITE);
            tryCEvents();
        }
        results();
    }
    private boolean simulate(){
        return Clock.getInstance().getClock() < simulationTime;
    }


    private double currentTime(){
        return eventList.getNextEventTime();
    }

    private runBEvents() {
        while (eventList.getNextEventTime() == Clock.getInstance().getClock()) {
            Event e = eventList.remove();
            if (e != null) {
                runEvent(e);
            }
        }
    }
    protected abstract void initialize();
    protected abstract void runEvent(Event e);
    protected abstract void tryCEvents();
    protected abstract void results();
}
