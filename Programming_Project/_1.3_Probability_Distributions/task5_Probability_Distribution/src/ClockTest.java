public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Initial Time: " + clock.getTime());

        clock.setTime(12);
        System.out.println("Updated Time: " + clock.getTime());

        int currentTime = clock.getTime();
        System.out.println("Current Time: " + currentTime);

        Clock anotherClock = Clock.getInstance();
        System.out.println("Is it the same instance? " + (clock == anotherClock));
    }
}
